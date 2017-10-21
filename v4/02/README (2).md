# viikko 5 02

Viikon 5 perjantain tehtävät.

# Suunnittelumalleja funktionaalisesti


1. Määrittele Abstrakti tehdas (Abstract Factory) Meijeri, josta saadaan kolmenlaisia tuotteita: maitoa, juustoa, jugurttia.
Toteuta kaksi erilaista konkreettista tehdasta: laktoositon ja vähälaktoosinen.
Kirjoita testiohjelma, jossa käytät joko laktoosittomia tai vähälaktoosisia tuotteita.
Tehdas voidaan vaihtaa muuttamatta soivelluskoodia muulla tavalla kuin tehtaan vaihdolla.

* Tuotteille pitää määritellä omat rajapinnat: interface Maito jne.
* Katso mallia gitistä v5/02/AbstractFactory.


2. Määrittele vastuuketju (Chain of Responsibility), jossa käsitellään merkkijonona välitettävä dokumentti.
Ensimmäinen käsittelijä poistaa dokumentista kaikki ylimääräiset välilyönnit. Toinen korvaa skandit seuraavasti: ä,å -> a; ö -> o; Ä,Å -> A; Ö -> O. 
Kolmas tarkistaa oikeinkirjoituksen: kaikki sturct-sanat korvataan struct-sanoilla.
* Katso mallia gitistä v5/02/ChainOfResponsibility.

3. Edellisessä tehtävässä tehdyt toiminnallisuudet voidaan nähdä merkkijonon käsittelyyn liittyvinä erilaisina editointistrategioina. 
Tarkastele asiaa tästä näkökulmasta ja toteuta merkkijonon käsittely Strategy-mallin mukaisesti. 
* Katso mallia gitistä v5/02/Strategy.

4. Uutistoimisto tuottaa uutisia, joita se välittää eri medioille (Helsingin Sanomat, Ilta-Sanomat jne.) Kirjoita ja testaa Observer-mallin mukainen ratkaisu, 
jossa Helsingin Sanomat välittää lukijoilleen (tulostaa ruudulle) kaikki uutiset, joista löytyy avainsana "politiikka" ja Ilta-Sanomat jokaisen, josta löytyy avainsana "julkkis".
* Katso mallia gitistä v5/02/Observer.

5. Vuoropohjaisen pelin (shakki, pokeri jne. ) logiikka voidaan esittää seuraavalla algoritmilla (= Template Method):

```
 abstract class Game {
 
    protected int playersCount;
    abstract void initializeGame();
    abstract void makePlay(int player);
    abstract boolean endOfGame();
    abstract void printWinner();

    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
```
* Pystytkö esittämään tälle funktionaalisen version ja jonkin pelin toteutuksen? 
* Katso mallia gitistä v5/02/TemplateMethod.