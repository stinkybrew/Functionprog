# viikko 7/01 


# Pegthing-pelin toteutuksen syvin olemus


Peli (git:ssä pegthing) on yhdessä clj-tiedostossa mutta jakautuu arkkitehtuurisesti kahteen kerrokseen:

* Käyttöliittymä
* Malli

Kaikki kommunikointi käyttäjän kanssa käydään käyttöliittymäkerroksessa, joka käyttää mallikerrosta. Malli ei kutsu käyttöliittymän funktioita.

Käyttölittymäkerros:
* keskustelu
* pelilaudan tulostaminen

Mallikerros:
* uuden pelilaudan luonti
* käyttäjän siirron käsittely


1. Ohjelman aluksi käyttäjältä kysytään pelilaudan koko.
```
(defn prompt-rows
  []
  (println "How many rows? [5]")
  (let [rows (Integer. (get-input 5))
        board (new-board rows)]
    (prompt-empty-peg board)))
```
 
* Huomaat, että käyttäjän antamaa syötettä ei tarkisteta.
* Lisää funktioon piirre, että alle 5 rivin lautoja ei hyväksytä, vaan ohjelma kysyy rivien lukumäärää uudestaan, jos annettu luku on alle 5.

2. Kun rivien määrä on saatu selville, luodaan uusi pelilauta eli board new-board-funktiolla.
Pelilaudan positioiden numerointi on pelissä seuraava
 ```
                1
            2       3
        4       5       6
    7       8       9       10
11      12      13      14      15
```
* Luontifunktio:
```
(defn new-board
  [rows]
  (let [initial-board {:rows rows}
        max-pos (row-tri rows)]
    (reduce (fn [board pos] (add-pos board max-pos pos))
            initial-board
            (range 1 (inc max-pos)))))
 ```
 
 * Tutki, minkälainen tietorakenne syntyy.
 
3. Pelilaudan luonnissa on oleellisessa asemassa tri*-funktio, joka luo lazy seq:n triangeli-lukuja eli rivien viimeiset luvut: 1 (0+1), 3 (=1+2), 6 (=1+2+3),10 (=1+2+3+4) , 15 (=1+2+3+4+5) jne. 
Funktio luo periaatteessa äärrettömän määrän näitä lukuja, mutta käytännössä (lazy-seq)) vain ne luvut, joita tarvitaan.
```
(defn tri*
  "Generates lazy sequence of triangular numbers"
  ([] (tri* 0 1))
  ([sum n]
     (let [new-sum (+ sum n)]
       (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))
```
* Ohjelmassa on määritelty:
```
(def tri (tri*))
```

* Tutki, mitä seuraavat tekevät ja miksi:

```
(take 6 tri)
(last (take 6 tri))
```
* Selvitä ja kerro, kuinka jälkimmäistä kutsua hyödynnettiin pelilaudan luonnissa (new-board:ssa funktio row-tri)?

4. Seuraavilla funktioilla tutkitaan siirron kelvollisutta ja siirretään nappulaa. Ensimmäiset 4 ovat itseään selittäviä. Selitä, miksi ja miten ne toimivat niinkuin on tarkoitus:
```
(defn pegged?
  "Does the position have a peg in it?"
  [board pos]
  (get-in board [pos :pegged]))

(defn remove-peg
  "Take the peg at given position out of the board"
  [board pos]
  (assoc-in board [pos :pegged] false))

(defn place-peg
  "Put a peg in the board at given position"
  [board pos]
  (assoc-in board [pos :pegged] true))

(defn move-peg
  "Take peg out of p1 and place it in p2"
  [board p1 p2]
  (place-peg (remove-peg board p1) p2))

```
* Seuraava funktio selvittää nappulalle kaikki kelvolliset siirrot:

```
(defn valid-moves
  "Return a map of all valid moves for pos, where the key is the
  destination and the value is the jumped position"
  [board pos]
  (into {}
        (filter (fn [[destination jumped]]
                  (and (not (pegged? board destination))
                       (pegged? board jumped)))
                (get-in board [pos :connections]))))
```

* Kokeile funktiota määrittelemällä oma-lauta:
```
(def oma-lauta (assoc-in (new-board 5) [4 :pegged] false))
```

* Testaa tämän jälkeen valid-moves-funktion toimintaa.

5. Tutki, mitä tekevät seuraavat funktiot ja selitä toimintaperiaate:

```
(defn valid-move?
  "Return jumped position if the move from p1 to p2 is valid, nil
  otherwise"
  [board p1 p2]
  (get (valid-moves board p1) p2))

(defn make-move
  "Move peg from p1 to p2, removing jumped peg"
  [board p1 p2]
  (if-let [jumped (valid-move? board p1 p2)]
    (move-peg (remove-peg board jumped) p1 p2)))

(defn can-move?
  "Do any of the pegged positions have valid moves?"
  [board]
  (some (comp not-empty (partial valid-moves board))
        (map first (filter #(get (second %) :pegged) board))))

```

6. Jatka omaan tahtiin koodin selvittämistä (raportointi vapaaehtoista).






 


 





 
 






