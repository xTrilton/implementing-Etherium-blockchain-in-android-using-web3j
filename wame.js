/**
 * @return {PromiseLike<string>}
 */
function ps() {}
 
/**
 * @returns {{ a: string, b: number }} - May use '@returns' as well as '@return'
 */
function ab() {}

function special(options) {
  return (options.prop4 || 1001) + options.prop5;
}
