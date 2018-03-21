'use strict';

/* Luis Atencion kirjasta Functional Programming in JavaScript */
function coordinate(lat, long) {
	let _lat = lat;
	let _long = long;
	return {
		latitude: function () {
			return _lat;
		},
		longitude: function () {
			return _long;
		},
		translate: function (dx, dy) {
			return coordinate(_lat + dx, _long + dy);
		},
		toString: function () {
			return '(' + _lat + ',' + _long + ')';
		}
	};
}


// Käyttöä:

const greenwich = coordinate(51.4778, 0.0015); greenwich.toString(); 
	// -> ’(51.4778, 0.0015)’
	
console.log(greenwich.toString());	

let g = greenwich.translate(10, 10); 
// -> ’(61.4778, 10.0015)’ = uusi objekti
console.log(g.toString());	
console.log(g.longitude());

g.translate(10,10);
console.log(g.toString());	// alkuperäinen g ei muutu, translate valuu hukkaan
console.log(g.longitude());

g = g.translate(10, 10);  // muuttuja g saa uuden arvon
console.log(g.toString());	
console.log(g.longitude());



