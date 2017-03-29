'use strict'

function summa(taulukko, f){
    // jos f antamatta
    // f ei tee parametreille mitään
    if (typeof f != 'function') f = x => x;
    
    return taulukko.reduce((a, x) => a += f(x), 0); 
    
}

// Voidaan kutsua:

console.log(summa([1,2,3]));
console.log(summa([1,2,3], x => x * x));


// Muutetaan yksiparametriseksi:

function summaaja(f){
    return function(taulukko){
        return summa(taulukko, f);
    }; 
}

// sama kirjoitettuna toisin korvaamalla anonyymi funktio nuolimerkinnällä:
function summaajaArrow(f){
        return taulukko => summa(taulukko, f);
}

// Käytetään summaajaa: injektoidaan sen sisään funktio ja saadaan uusi funktio, joka ottaa vastaan taulukon

console.log(summaaja(x => x + 1)([1,2,3]));

// Voidaan hyödyntää myös partial application'ia, jossa funktio kiinnitetään (= osittainen soveltaminen):

const nelioidenSummaaja = summaaja(x  => x*x);
console.log(nelioidenSummaaja([1,2,3]));

const kuutioidenSummaaja = summaajaArrow(x => Math.pow(x,3));
console.log(kuutioidenSummaaja([1,2,3]));