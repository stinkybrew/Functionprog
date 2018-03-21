'use strict';

/* Luis Atencion kirjasta Functional Programming in JavaScript */
function zipCode(code, location) {
	let _code = code;
	let _location = location || '';
	return {
		code: function () {
			return _code;
		},
		location: function () {
			return _location;
		},
		fromString: function (str) {
			let parts = str.split('-');
			return zipCode(parts[0], parts[1]);
		},
		toString: function () {
			return _code + '-' + _location;
		}
	};
}

// Käyttöä:

const princetonZip = zipCode("08544", "3345");
console.log(princetonZip.toString()); // -> ’08544-3345’

console.log(princetonZip.fromString("1-2").toString()); // -> ’1-2’ = uusi objekti
console.log(princetonZip.toString()); // -> ’08544-3345’ // muuttumaton objekti

let pr2 = princetonZip.fromString("2-2").toString(); // -> ’1-2’ = uusi objekti

console.log(pr2.toString());