'use strict'

const f = function () {
    return function (x) {
		return x+1;
	 }
	}(); // Huomaa funktion kutsu!

let tulos = f(3);

console.log(tulos);