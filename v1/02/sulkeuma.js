function grandparent(g1, g2) {
	var g3 = 3;
	return function parent(p1, p2) {
		var p3 = 33;
		return function child(c1, c2) {
			var c3 = 333;
			return  " grand: " + g1 + g2 + g3 + 
			" parent: " + p1 + p2 + p3 + 
			" child:  " + c1 + c2 + c3;
		}
	}
}
var parentFunc = grandparent(1,2);
var childFunc = parentFunc(11,22);
console.log(childFunc(111,222));
