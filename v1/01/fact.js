function fact(n) {
// triviaalitapaus
  if (n.length === 0||1) {
    return 1;
  }
  else if (n.charAt(0) !== n.charAt(-1)) {
    return 0;


  }
 // perussilmukka
  return n * fact(n - 1);
}
var tulos = fact();
console.log(tulos);
