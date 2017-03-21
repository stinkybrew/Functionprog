'use strict'

function tervehdysteksti(nimi){
  		return 'Moi, '+ nimi;
}

function anteeksipyynto(nimi){
  		return 'Anteeksi, '+ nimi;
}

function annaFraasi(fraasi,nimi) {
 		return fraasi(nimi);
}

console.log(annaFraasi(tervehdysteksti, 'Masa')); 
console.log(annaFraasi(anteeksipyynto, 'Aku')); 

// Jos fraasi, esim. tervehdys, muuttuu, muutetaan vain yhteen paikkaan. Kutsut eivät muutu.