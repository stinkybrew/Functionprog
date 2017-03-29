var isEven = function(x) {
  return x%2 === 0;
};

console.log([2,5,6,7,13].filter(isEven));

console.log([2,5,6,7,13].filter(x => x%2 === 0 ));
