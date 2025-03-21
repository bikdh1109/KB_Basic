// import { name, age, greet } from './01_named_export.js';

// console.log(name);
// console.log(age);
// console.log(greet());

// default export
import addFunction from './03_defalut_export.js';
console.log(addFunction(4, 5));

// exports
import { name, age, greet } from './04_exports.js';
console.log(name);
console.log(age);
console.log(greet());
/*
1. 별칭으로 가져오기
import { name as userName, age as userAge } from './01_named_export.js';

2. 전부 가져오기
import * as utils from './01_named_export.js';

utils.name
utils.age

*/
