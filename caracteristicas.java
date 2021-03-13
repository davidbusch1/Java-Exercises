/*
Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, 
quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
*/

var count;
var positivos = 0;
var negativos = 0;
var pares = 0;
var impares = 0;
for(count = 0; count < 5; count++){
    let valor = gets();
    if (valor > 0){
        positivos++;
    }if (valor < 0){
        negativos++;
    }if (valor%2 == 0){
        pares++;
    }if (valor%2 != 0){
        impares++;
    }
}
console.log(pares+" valor(es) par(es)");
console.log(impares+" valor(es) impar(es)");
console.log(positivos+" valor(es) positivo(s)");
console.log(negativos+" valor(es) negativo(s)");

