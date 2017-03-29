'use strict';

const Immutable = require('immutable');

const lista1 = Immutable.List([1,2,3,4,5,6]);

const lista2 = lista1.withMutations(
        function (list){
           list.push(7);
           list.push(8).push(9);
        }); 
        
        
console.log(lista1);        
console.log(lista2);        