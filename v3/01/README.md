# viikko 3 01

Viikon 3 torstain materiaalia.

# Java8:n funktionaalisia piirteitä

Java8:iin on tullut uutena

- lambdalausekkeet
- vuot (stream)
- aggregaattioperaatiot (vastaavat Javascriptin Array-luokan metodeja map, reduce jne.)


1. Kirjoita uudestaan seuraavat Javasriptillä kirjoitetut funktiot käyttäen Javan lambdalausekkeita (lambda exression)
```
function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}
function area(radius)   
    {  
        return Math.PI * radius * radius;  
    };  
```

2. Etsi kaikki rahansiirrot (transaction), jotka ovat tehty vuoden 2012 jälkeen ja joiden arvo on vähintään 900 (PuttingIntoPractice.java-tiedostossa on lueteltu välittäjiä ja rahansiirtoja). Laske eri ruokalajien määrä (Dish.java-tiedostossa on lueteltu ruokalajeja) käyttäen map- ja reduce-operaatioita.

3. Tee vuo, jossa generoit 20 satunnaislukua, muutat ne nopan silmäluvuiksi sopiviksi välille 1-6, ja lasket kuinka monta kutosta saadaan.

4. Kahdessa taulukossa on numeroita esim. [1,2,3] ja [3,4]. Miten tuotat kaikki numeroparit, joissa ensimmäinen numero on ensimmäisestä listasta ja toinen toisesta. Esimerkkilistoista tulisi lista, jossa on parit [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]

5. Hakemistossa on kalevala.txt-niminen tiedosto, jossa on Kalevalan alusta pieni pätkä. Käytä hyväksesi Javan NIO APIa ja siellä määriteltyä java.nio.file.Files.lines-metodia, joka palauttaa streamin. Katso esimerkkiä tiedostosta stream-hakemistosta BuildingStreams.java-tiedostosta.
Esimerkissä etsitään, kuinka monta eri sanaa esiintyy tiedostossa. Muokkaa esimerkkiä ja tee samanlainen esiintymälista kuin Javasriptillä viime viikolla.

Esimerkiksi listasta 
```
'This is  a test.  This is only a test.'
```
pitää tulla tuloksena
```
{“a”:2, ”is”:2,  “only”:1, “test”:2, “this”:2 }
```



