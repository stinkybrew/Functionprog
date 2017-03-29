'use strict'

let piste = { x:1, y:2};

function kasvata(piste){
    piste.x++;
    piste.y++;
}

function uusi_piste(piste){
    let uusi_p = {x: piste.x++, y: piste.y++};
    return uusi_p;
}

kasvata(piste);

console.log(piste);
let piste2 = uusi_piste(piste);
console.log(piste2);
console.log(piste);
    