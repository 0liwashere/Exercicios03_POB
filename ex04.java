import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite A (início do intervalo): ");
        int a = scanner.nextInt();

        System.out.print("Digite o limite B (fim do intervalo): ");
        int b = scanner.nextInt();

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int numero = a; numero <= b; numero++) {
            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("A quantidade de números pares: " + quantidadePares);
        System.out.println("A quantidade de números ímpares: " + quantidadeImpares);

        scanner.close();
    }
}
