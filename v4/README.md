# viikko 4 

Viikon 4 tehtävät.

# Rinnakkaista laskentaa ja omia Collectoreja




3. a) Kirjoita oma Collector-rajapinnan toteuttaja, joka toimii kuten Collector.joining()-tehdasmetodin palauttama Collector-toteutus.
Tuota koodaamasi kollektorin avulla merkkijono ArrayList-tietorakenteen sisältämistä Omena-olioista. 
Kirjoita myös oma joining()-metodia vastaava staattinen tehdasmetodi omaan OmatKollektorit-luokkaan ja käytä sitä.
* Vinkki: käytä StringBufferia Supplierin paluuarvona.
<br><br>
b) Pystyykö edellisen toteuttamaan yhdellä usean säikeen yhteisellä StringBufferilla, jos hyödynnetään rinnakkaisuutta?
Testaa sopivalla, riittävän isolla aineistolla.
* Testaa siis CONCURRENT -optimoinnin käyttö. Järjestyksellä ei ole väliä tuloslistaa muodostettaessa.

4. Kirjoita oma Collector-rajapinnan toteuttaja vuossa olevien elementtien lukumäärän laskemiseksi. 
* Käytä Stream.generate -generaattoria vuon generoimiseksi.
* Mittaa aikoja sekä sarjalliselle että rinnakkaiselle laskennalle.
* Pystytkö tässä käyttämään yhtä tulosoliota rinnakkaislaskennassa ilman combinerin käyttöä?

5. Tutki välitulostuksin, kuinka fork/join -kehys pilkkoo virran ja kokoaa tulokset gitissä V4/02/ olevaa 
OmaListaCollectoria käytettäessä, kun laskenta suoritetaan rinnakkaisesti.


Extra:
* Selvitä testaamalla ja esim.APIa tutkimalla, mitä tarkoittaa seuraava:
```
List<Omena> omenaLista = omenaStream.collect(
    ArrrayList::new,
    List::add,
    List::addAll);
```

