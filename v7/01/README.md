# viikko 7 01

Viikon 7 torstain materiaalia.

# Clojuren kontrollirakenteet




1. Arvo lottorivi. Arvo luvut valitsemaasi tietorakenteeseen ja tulosta ne. Käytä Clojuren silmukkarakenteita
esim. loop, doseq tms.

2. Kahden luvun suurin yhteinen tekijä on suurin luku, jolla molemmat luvut ovat jaollisia.  Esimerkiksi lukujen 102 ja  68 suurin tekijä on 34.

```
syt(p, q) {
  Jos q on 0, palauta p.
  Muuten 
    selvitä rekursiivisella metodikutsulla, mikä on suurin yhteinen tekijä q:lle ja p%q:lle,
	ja
    palauta sama luku, jonka rekursiivinen kutsukin palautti.
}
```
Toteuta tämä funktio recur:in avulla.


3. Hakemistossa on kalevala.txt-niminen tiedosto, jossa on Kalevalan alusta pieni pätkä. Käytä slurpia tiedoston lukemiseen. Tee samanlainen esiintymälista kuin Javasriptillä/Javalla aiemmin.

Esimerkiksi listasta 
```
'This is  a test.  This is only a test.'
```
pitää tulla tuloksena
```
{“a”:2, ”is”:2,  “only”:1, “test”:2, “this”:2 }
```
4. Viikolla 3 käsiteltiin pisteitä ja pisteiden transformaatioita. Esillä oli seuraava Java-kielinen ohjelma.

```
public class PisteenTransformaatiot {
          
    public static void main(String[] args) {
               
       Function siirto = Piste.makeSiirto(1, 2);
       Function skaalaus = Piste.makeSkaalaus(2);
       Function kierto = Piste.makeKierto(Math.PI);
       Function muunnos = // muodosta tässä yhdistetty funktio
       
       Piste[] pisteet = {new Piste(1,1), new Piste(2,2), new Piste(3,3)};
       List<Piste> uudetPisteet = new CopyOnWriteArrayList();
       
       for (Piste p: pisteet){
           uudetPisteet.add((Piste)muunnos.apply(p));
       } 
  
       uudetPisteet.forEach(p -> System.out.println(p));
    }
}
```
Mieti millaista tietorakennetta käyttäisit Clojuressa. Toteuta funktiot siirto, skaalaus ja kierto. Toteuta 
vastaavanlainen toiminnallisuus Clojuressa: Käyt läpi pisteitä sisältävää tietorakennetta ja kohdistat jokaiseen pisteeseen kaikki funktiot.




