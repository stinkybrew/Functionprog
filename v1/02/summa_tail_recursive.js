function summa(ala, yla){ // sigmalauseke
	return summaHelper(ala, yla, 0);
}

function summaHelper(ala, yla, sum){ // sigmalauseke
	if (ala > yla) return sum;
	return summaHelper(ala+1, yla, sum+ala);
}


console.log(summa(1,5));