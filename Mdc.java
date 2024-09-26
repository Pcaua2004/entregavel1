import java.util.Scanner;

public class Mdc {
    public void mdc() {
        Scanner prompt = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Bem-vindo(a) ao calculador de MDC!");

            System.out.print("Digite o valor de A e B separado por espaço.\nEx.: 15 20: ");
            String entrada = prompt.nextLine();
            String[] valores = entrada.split(" ");

            if (valores.length != 2) {
                System.out.println("Entrada inválida. Por favor, digite dois números separados por espaço.");
                continue;
            }

            int a = Integer.parseInt(valores[0]);
            int b = Integer.parseInt(valores[1]);

            int menor = Math.min(a, b);
            int mdc = 1;

            for (int i = 1; i <= menor; i++) {
                if (a % i == 0 && b % i == 0) {
                    mdc = i;
                }
            }

            System.out.println("O MDC de " + a + " e " + b + " é " + mdc + "!");

            System.out.print("Digite 1 para calcular o MDC de outros números ou 2 para sair: ");
            int opcao = prompt.nextInt();
            prompt.nextLine();

            if (opcao == 2) {
                System.out.println("--------------------------------");
                System.out.println("Obrigado por usar o calculador de MDC!");
                System.out.println("--------------------------------");
                break;
            }
        }

        prompt.close();
    }
}
