import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10: ");
        int numeroEscolhido = scanner.nextInt();
        if (numeroEscolhido >= 1 && numeroEscolhido <= 10) {
          System.out.println("O número escolhido foi: " + numeroEscolhido);
        } else {
            System.out.println("O número digitado não está entre 1 e 10.");
          System.out.println("Parabéns! otima execução, mas não foi dessa vez. Numero inválido!");
        }

        scanner.close();
    }
}
