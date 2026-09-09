import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SENHA_CORRETA = 2026;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != SENHA_CORRETA) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }
        } while (senhaDigitada != SENHA_CORRETA);

        System.out.println("Acesso Permitido!");

        scanner.close();
    }
}
