import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        long fatorial = 1;

        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);

        scanner.close();
    }
}
