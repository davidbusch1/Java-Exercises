/*
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. 
Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, 
seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.
*/

let valor = parseInt(gets());
console.log(valor);

cem = parseInt(valor/100);
console.log(cem + " nota(s) de R$ 100,00");
valor = valor%100;

cinqu = parseInt(valor/50);
console.log(cinqu + " nota(s) de R$ 50,00");
valor = valor%50;

vinte = parseInt(valor/20);
console.log(vinte + " nota(s) de R$ 20,00");
valor = valor%20;

dez = parseInt(valor/10);
console.log(dez + " nota(s) de R$ 10,00");
valor = valor%10;

cinco = parseInt(valor/5);
console.log(cinco + " nota(s) de R$ 5,00");
valor = valor%5;

dois = parseInt(valor/2);
console.log(dois + " nota(s) de R$ 2,00");
valor = valor%2;

um = valor;
console.log(um + " nota(s) de R$ 1,00");