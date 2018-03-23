function summa(ala, yla){ // sigmalauseke


	function summaHelper(ala, yla, sum){ // sigmalauseke
		if (ala > yla) return sum;
		return summaHelper(ala+1, yla, sum+ala);
	}


	return summaHelper(ala, yla, 0);
}



console.log(summa(1,5));