import java.util.Scanner;

public class FibonacciDois {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa que gera sequência de Fibonacci até um determinado número");
        System.out.println("Digite o número referente ao tamanho da sequência");

        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = scanner.nextInt();
        int numFibonacciMenosUm = 1;
        int numFibonacciMenosDois = 0;
        int numFibonacci = 0;
        boolean naoPassouPeloF1 = true;

        do {

            if (numFibonacci == 0){
                System.out.println("0");
                numFibonacci++;
                continue;
            }

            if (numFibonacci == 1 && naoPassouPeloF1){
                System.out.println("1");
                naoPassouPeloF1 = false;
                continue;
            }

            numFibonacci = numFibonacciMenosUm + numFibonacciMenosDois;

            if (numFibonacci > numeroEscolhido){
                continue;
            }

            if (numeroEscolhido == 1){
                break;
            }

            System.out.println(numFibonacci);

            numFibonacciMenosDois = numFibonacciMenosUm;

            numFibonacciMenosUm = numFibonacci;


        }while (numFibonacci <= numeroEscolhido);


    }
}


