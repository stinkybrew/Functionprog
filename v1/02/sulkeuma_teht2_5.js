'use strict';

let f, g;
function foo() {
  let x;
  f = function() { return ++x; };
  g = function() { return --x; };
  x = 1;
  console.log('inside foo, call to f(): ' + f());
}
foo();  
console.log('call to g(): ' + g()); 
console.log('call to f(): ' + f()); 