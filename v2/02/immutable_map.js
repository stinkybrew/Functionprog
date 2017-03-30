'use strict';

const Immutable = require('immutable');
const map1 = Immutable.Map({a:1, b:2, c:3});
const map2 = map1.set('b', 50);
console.log(map1.get('b')); // 5
console.log(map2.get('b')); // 50


const map3 = Immutable.Map({a: 1, b: 2, c: 3 });
const map4 = map3.set('b', 2);
console.log(map3.equals(map4)); // true , verrataan by value, ei by reference
console.log(Immutable.is(map3,map4)); // true, sama juttu
const map5 = map3.set('b', 50);
console.log(map3.equals(map5)); //false