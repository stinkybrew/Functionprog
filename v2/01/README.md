# viikko 2 01

Viikon 2 torstain materiaalia.

# Taulukoiden käsittely

Käsittelemme taulukoita eri metodeilla.


1. Kirjoita uudestaan käyttäen nuolifunktioita (arrow functions).
```
function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}
function area(radius)   
    {  
        return Math.PI * radius * radius;  
    };  
```

2. Taulukossa on JSON-muotoista dataa movies.js. Käsittele taulukkoa map-metodilla niin, että saat uuden taulukon, jossa on elokuvista vain title- ja release-kentät.

3. Siivilöi filter-metodilla movies.js taulukosta vain ne elokuvat, jotka ovat ilmestyneet vuoden 2011 jälkeen.

4. Oletetaan, että Helsingin kuukausittaiset keskilämpötilat vuodelta 2016 ja 2015 ovat taulukoissa. Tuota uusi taulukko, jossa on kahden vuoden kuukausittaiset keskiarvot. Siivilöi (filter-metodi) taulukosta positiiviset kuukausikeskiarvot ja laske niistä keskilämpötila (reduce-metodi).

5. Hakemistossa on kalevala.txt-niminen tiedosto, jossa on Kalevalan alusta pieni pätkä. Käsittele tiedosto niin, että saat aikaan sanojen esiintymälistan. 
Käytössäsi on seuraavat metodit: match, map ja reduce. Vielä viimeiseksi voit viimeistellä esiintymälistan lajittelemalla sen aakkosjärjestykseen.

Esimerkiksi listasta 
```
'This is  a test.  This is only a test.'
```
pitää tulla tuloksena
```
{“a”:2, ”is”:2,  “only”:1, “test”:2, “this”:2 }
```



