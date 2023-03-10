package Questao2;


import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Fibonacci questao2 = new Fibonacci();

        System.out.print("Digite o numero a ser testado: ");

        //Variavel que captura o valor informado pelo teclado
        String numero = scan.nextLine();

        //Laço que valida se o valor é inteiro
        while (validaInteiro(numero) != true){
            System.out.print("Digite o numero INTEIRO ser testado: ");
            numero = scan.nextLine();
        }
        //Transformação do valor lido em String para inteiro
        int numeroTeste = Integer.parseInt(numero);

        //Tesete de verificação se o numero pertence ou não a sequencia
        if(questao2.pertence(numeroTeste) == true) System.out.printf( numero + " está contido na sequencia de Fibonacci");
        else System.out.printf( numero + " não está contido na sequencia de Fibonacci");

    }

    //Metodo de validação do formato passado pelo teclado
    private static boolean validaInteiro(String numero) {
        try {
            //Caso o numero informado seja inteiro, retorna verdadeiro
            int numeroInteiro = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            try {
                //Caso o numero informado seja ponto flutuante, retorna falso
                float numeroFloat = Float.parseFloat(numero);
                return false;
            } catch (NumberFormatException ex) {
                //Caso o valor não seja nenhum dos dois, retorna falso
                return false;
            }
        }
    }
}

