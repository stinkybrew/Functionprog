// kaikki parametrit
console.log([0, 1, 2, 3, 4].reduce(
  function (
    accumulator,
    currentValue,
    currentIndex,
    array
  ) {
    return accumulator + currentValue;
  }
));

// vain keruuarvo ja käsiteltävä arvo
console.log([0, 1, 2, 3, 4].reduce(
  function (
    accumulator,
    currentValue
    ) {
    return accumulator + currentValue;
  }
));

// ja sama nuolifunktiolla
console.log([0, 1, 2, 3, 4].reduce( (accumulator, currentValue) => 
                       accumulator + currentValue ));
                       
var sum = [9, 8, 7].reduce((memo, value) => memo + value, 0);
console.log(sum);


// ostoskärryn sisältö
var shoppingCart = [
    {name: 'phone', qty: 1, price: 699},
    {name: 'Screen Protector', qty: 1, price: 9.98},
    {name: 'Memory Card', qty: 2, price: 20.99}
];

// lasketaan sille arvo ja annetaan 10 %:n alennus
var total = shoppingCart.reduce(function (prev, curr) {
    return prev + curr.qty * curr.price * 0.9;
},0);

console.log(total); // 675.864