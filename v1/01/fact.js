function fact(n) {
// triviaalitapaus
  if (n === 0) {
    return 1;
  }
 // perussilmukka
  return n * fact(n - 1);
}
var tulos = fact(4);
console.log(tulos);
