# viikko 1 02


# Funktiot funktionaalisen ohjelmoinnin peruspilareina 

Funktionaalisessa ohjelmoinnissa on keskeistä, että funktiot ovat ohjelman täysivaltaisia jäseniä (first-class functions) ja että käytetään korkeamman asteen funktioita (higher-order functions). 

Käytännössä tämä tarkoittaa, että funktiot voivat saada parametrikseen funktiota, voivat palauttaa arvoinaan funktioita ja että funktioita voidaan sijoittaa muuttujille arvoiksi, taululkoiden alkioiksi jne.

## 2 Funktiot

Ohjelmoi seuraavat tehtävät JavaScriptillä.
Vie koodisi myös omaan git-repoosi, jonne olet antanut opettajille oikeudet (simosilander, )


1. <b>Anonyymi funktio paluuarvona</b>: Kirjoita funktio, joka palauttaa arvonaan anonyymin funktion, jolla voidaan verrata kahta lukua keskenään. 

    Paluuarvo  1: ensimmäinen on suurempi

    Paluuarvo -1: toinen on suurempi

    Paluuarvo  0: luvut ovat yhtä suuria.
    

2. <b>Funktio parametrina</b>: Kirjoita funktio, jolle annetaan parametrina edellisen tehtävän funktion kutsu (käytännössä funktiolle välitetään anonyymi funktio) ja kaksi taulukkoa, jossa toisessa on Helsingin kuukausittaiset keskilämpötilat vuodelta 2015 ja toisessa vuodelta 2016.
Funktio käyttää parametrina saamaansa funktiota ja palauttaa tiedon siitä, kuinka monessa tapauksessa vuoden 2016 keskilämötila oli korkeampi.


3. <b>Funktioita taulukossa</b>: Versionhallinnassa on <code>v1/02/fns_in_array.js</code> -skripti. Siinä suoritetaan 2D-transformaatioita tason pisteelle (siirtymä ja zoomaus). 
Lisää funktiot sisältävään <code>pipeline</code>-taulukkoon (liukuhihna) kolmas muunnos, joka on kierto. Kierto (rotaatio) kulman verran vastapäivään origon ympäri määritellään alla olevien lausekkeiden avulla.
Kulma ilmoitetaan radiaaneina. Esim. 180 astetta on Math.PI. 

    Lisää skriptiin kolmanneksi muunnokseksi rotaatio 180 astetta origon ympäri vastapäivään.

    Tutki, saatko liukuhihnalla haluamasi tuloksen (1,1) -> (-4,-6).
    
    Pisteen (x,y) kierto phi-astetta (radiaaneina) origon ympäri vastapäivään:


```
    x' = x*cos(phi) - y*sin(phi)
    
    y' = x*sin(phi) + y*cos(phi)
```


4. <b>Häntärekursio</b>: Edellisessä tehtäväsarjassa toteutit potensiin korotuksen rekursiivisena funktiona. Jos ratkaisusi ei ollut häntärekursiivinen, niin muuta se sellaiseksi.
 

5. <b>Sulkeuma</b>: Tutki seuraavaa ohjelmaa (repossa <code> v1/02/sulkeuma_teht2_5.js</code>). Selvitä, mitä siinä tehdään ja miksi se tulostaa sitä, mitä tulostaa. Muuta foo-funktion koodi sellaiseksi, että sillä ei ole sivuvaikutuksia: 
toteuta IIFE, joka palauttaa objektiliteraalin, jossa on kaksi funktiota ja joita voidaan kutsua tyyliin Moduuli.kasvata() ja Moduuli.vahenna(), kun IIFE:n kutsu on muotoa:  var Moduuli = (function(){...})();

    ```
        'use strict';
        
        let f, g;
        function foo() {
          let x;
          f = function() { return ++x; };
          g = function() { return --x; };
          x = 1;
          console.log('inside foo, call to f(): ' + f());
        }
        foo();  
        console.log('call to g(): ' + g()); 
        console.log('call to f(): ' + f());  
    ```

