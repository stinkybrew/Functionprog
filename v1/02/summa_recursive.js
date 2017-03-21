function summa(ala, yla){ // sigmalauseke
	if (ala > yla) return 0;
	return ala + summa(ala+1, yla);
}

console.log(summa(1,5));