/*
Desafios
Crie um programa que leia um número e mostre os números pares até esse número, 
inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
*/

var count;
var valor = 2;
let n = gets();
for(count = 0; count < n; count++){
    if (valor <= n){
    console.log(valor);
    valor = valor + 2;
    }
}
