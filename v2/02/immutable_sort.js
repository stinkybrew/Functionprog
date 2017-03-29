'use strict';

const hahmot = ['Minni', 'Mikki', 'Aku', 'Iines'];

const sorted = hahmot.slice().sort();

console.log(hahmot === sorted); // false

console.log(hahmot); //[ 'Minni', 'Mikki', 'Aku', 'Iines' ]
console.log(sorted); //[ 'Aku', 'Iines', 'Mikki', 'Minni' ]
