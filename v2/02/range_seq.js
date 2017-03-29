'use strict';

const Immutable = require('immutable');

let tulos = Immutable.Range(1, Infinity)
  .skip(10000)
  .map(n => -n) // 
  .filter(n => n % 2 === 0)
  .take(2)
  .reduce((a, n) => a += n, 0);
  
console.log(tulos);

