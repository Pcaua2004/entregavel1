import java.util.Scanner;

public class Fibonacci {
    public void fibonacci() {
        Scanner prompt = new Scanner(System.in);
        int N;

        System.out.println("--------------------------------");
        System.out.println("Bem-vindo(a) ao Gerador de Fibonacci!");

        while (true) {
            System.out.print("Digite quantos números (N) seu Fibonacci terá!\nOBS: N > 1: ");
            N = prompt.nextInt();

            if (N > 1) {
                break;
            } else {
                System.out.println("O número deve ser maior que 1. Tente novamente.");
                System.out.println("--------------------------------");
            }
        }

        int a = 0; 
        int b = 1; 

        System.out.println("Sequência de Fibonacci até " + N + " termos:");
        System.out.println("--------------------------------");

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");

            int proximoTermo = a + b;
            a = b;
            b = proximoTermo;
        }

        System.out.println();
        System.out.println("--------------------------------");
        
        System.out.print("Digite 1 para gerar outra sequência ou 2 para sair: ");
        int opcao = prompt.nextInt();
        
        if (opcao == 1) {
            fibonacci(); 
        } else {
            System.out.println("Obrigado por usar o Gerador de Fibonacci!");
            prompt.close();
        }
    }
}
