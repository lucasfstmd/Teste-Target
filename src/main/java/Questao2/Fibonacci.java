package Questao2;

public class Fibonacci {

    public boolean pertence(int elemento){

        //Primeiros numeros da sequencia
        int primeiroNumero = 0;
        int segundoNumero = 1;

        //Variavel de parada do laço
        int variavelParada = 0;

        //Loop de calculo dos proximos elementos da sequencia até a variavelParada
        while (variavelParada < elemento){
            variavelParada = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = variavelParada;
        }

        //Comparação para saber se o ultimo valor calculado é igual ao elemento desejado
        if(variavelParada == elemento) return true;
        else return false;
    }

}
