const myFunctionVar = function getNumber() {
  console.log(typeof funName === 'function'); // => true
  return 42;
}
console.log(myFunctionVar());    // => 42
console.log(myFunctionVar.name); // => 'getNumber'

console.log(typeof getNumber);   // => 'undefined'
/**
 * @param {string}  p1 - A string param.
 * @param {string=} p2 - An optional param (Google Closure syntax)
 * @param {string} [p3] - Another optional param (JSDoc syntax).
 * @param {string} [p4="test"] - An optional param with a default value
 * @returns {string} This is the result
 */


