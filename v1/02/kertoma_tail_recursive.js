'use strict'

function kertoma(n){ // sigmalauseke
	return kertomaHelper(n, 1);
}

function kertomaHelper(n, tulo){ // sigmalauseke
	if (n < 1) return tulo;
	return kertomaHelper(n-1, n*tulo);
}


for(let i=0; i < 5; i++){
	console.log(kertoma(i));
}
