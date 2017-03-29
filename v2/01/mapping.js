// name it
var mult = function(x) {
return x*x;
}
let listmap = [1,2,3].map(mult);

// use anonyme
var squares = [1, 2, 3].map(function (x) {
    return x * x;
});

// use arrow
let squares = [1, 2, 3].map(x => x * x);
console.log(squares);

// insert something with map
console.log([4, 5, 1].map(x => ( {foo: x} ) ));

// lists again
var evens = [2,4,6,8,10];

// Expression bodies
// adding 1 to each
var odds = evens.map(v => v + 1);

// adding elements index to element map(function(currentValue, index)
var nums = evens.map((v, i) => v + i);

console.log(odds);
console.log(nums);
