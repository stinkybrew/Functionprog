console.log([1, 2, 3]
            .map(x => x * x)
            .reduce((prev,cur) => prev+cur));
// outputs 14

console.log([1, 2, 3, 4, 5]
            .map(x => x * x) // korota toiseen potenssiin
	    .filter(x => x%2 === 0) // suodata vain parilliset
            .reduce((prev,cur) => prev+cur)); // laske yhteen
// outputs 20
