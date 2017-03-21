'use strict';

function grandparent(g1, g2) {
	let g3 = 3;
	return function parent(p1, p2) {
		let p3 = 33;
		return function child(c1, c2) {
			let c3 = 333;
			return  " grand: " + g1 + g2 + g3 + 
			" parent: " + p1 + p2 + p3 + 
			" child:  " + c1 + c2 + c3;
		};
	};
}
const parentFunc = grandparent(1,2);
const childFunc = parentFunc(11,22);
const tulos = childFunc(111,222);
console.log(tulos);
