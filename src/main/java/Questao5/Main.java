package Questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variavel para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");

        //Variavel com conteudo lido do teclado
        String palavra = scanner.nextLine();

        //Variavel iniciado vazia para de acordo com que o laço percorre a palavra, adiciona a letra, partindo do final para o inicio
        String palavraInvertida = "";

        //Laço para percorrer a palavra
        for (int i = palavra.length() - 1; i >= 0; i--) {
            //Metodo chartAt retorna o caractere em uma determinada posição de um objeto String
            palavraInvertida += palavra.charAt(i);
        }

        //Saida com palavra invertida
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
