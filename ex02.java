import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDigitados = 0;
        int somaTotal = 0;

        System.out.print("Digite um número (negativo para parar): ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            somaTotal += numero;
            quantidadeDigitados++;

            System.out.print("Digite um número (negativo para parar): ");
            numero = scanner.nextInt();
        }

        if (quantidadeDigitados > 0) {
            double media = (double) somaTotal / quantidadeDigitados;
            System.out.println("Quantidade de números digitados: " + quantidadeDigitados);
            System.out.println("Soma total: " + somaTotal);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
