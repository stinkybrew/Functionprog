# viikon 5 01 Tehtävät

## Clojuren piirteitä

Clojure-ohjelmointikielen perustehtäviä

- ohjelman rakenne
- tietorakenteet (list, vector, map ja set)
- funktioiden määrittely


1 Ensimmäiseksi päivitä Cloud 9 -työtilasi leinOhje.md-tiedoston mukaan.

2 Kokeile tämän jälkeen REPL:ssä seuraavia pikku tehtäviä:

- Muuta tämä Clojuren syntaksiin(2*5)+4. Evaluoi, tulos pitäisi olla 14. 

- Muuta tämä Clojuren syntaksiin(1+2+3+4+5). Evaluoi, tulos pitäisi olla 15. 

- kutsu funktiota
```
	(fn [name] (str "Tervetuloa Tylypahkaan " name))
```
omalla nimelläsi.

- Tulosta seuraavasta map-rakenteesta keskimmäinen nimi 
{:name {:first "Urho" :middle "Kaleva" :last "Kekkonen"}}


3 Kun generoit Leiningenin avulla projektin, Leinigngen generoi myös test-hakemiston, core_test.clj-tiedoston ja sinne yhden testin 
```
	(ns projekti.core-test
  	  (:require [clojure.test :refer :all]
            [projekti.core :refer :all]))

	(deftest a-test
  	  (testing "FIXME, I fail."
    	(is (= 0 1))))
```
Tämä testaus käyttää clojure.test-kirjastoa. Muutetaan projekti käyttämään Midje-kirjastoa, jossa testejä kirjoitetaan samaan tyyliin kuin yleensä Clojure-esimerkeissä on tapana. Muuta core_test.clj-tiedoston alkuun
```(ns projekti.core-test
    (:use projekti.core)
    (:use  midje.sweet))
```
Muuta project.clj-tiedoston sisällöksi
```
	(defproject projekti "0.1.0-SNAPSHOT"
  	:description "An example of using Midje for unit testing."
  	:url "http://example.com/FIXME"
  	:license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  	:dependencies [[org.clojure/clojure "1.8.0"]]
  	:main ^:skip-aot projekti.core
  	:target-path "target/%s"
  	:profiles {
    	:dev {
  	    :dependencies [[midje "1.7.0"]]
  	    :plugins [[lein-midje "2.0.0-SNAPSHOT"]]}
      :uberjar {
              :aot :all}})
```
Kopioi test-hakemistoon core_test.clj-tiedostoon sisällösi v5/01/core_test.clj-tiedoston sisältö.

4 Kirjoita funktio *(square x)*, joka saa parametrina numeron, joka kerrotaan itsellään. 
```
	(square 2) ;=> 4
	(square 7) ;=> 49
```
Aja testit
```
	lein midje
```

5 Kirjoita funktio (karkausvuosi? vuosi), joka palauttaa arvon true, jos vuosi on karkausvuosi, muuten false. Vuosi on karkausvuosi, jos se on jaollinen 4:llä. 100:lla jaolliset eivät kuitenkaan ole karkausvuosia paitsi jos vuosi on jaollinen 400:lla.

```
	(karkausvuosi? 100) ;=> false
	(karkausvuosi? 200) ;=> false
	(karkausvuosi? 400) ;=> true
	(karkausvuosi? 12)  ;=> true
	(karkausvuosi? 20)  ;=> true
	(karkausvuosi? 15)  ;=> false
```
Aja testit
```
	lein midje
```
