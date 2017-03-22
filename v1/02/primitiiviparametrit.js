'use strict'

let numero1 = 5;
let numero2 = 6;
let numero3= 7;

let str = "javascript";

function kasvattele(numero1, numero2, str){
    numero1++;
    numero2++;
    numero3++;
    str = str+str;
    
    console.log(numero1);
    console.log(numero2);
    console.log(numero3);
    console.log(str);
}


kasvattele(numero1,numero2, str);

console.log(numero1);
console.log(numero2);
console.log(numero3);
console.log(str);
