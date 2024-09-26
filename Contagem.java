import java.util.Scanner;

public class Contagem {
    
    public void contagem() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Bem-vindo(a) ao contador de valores inteiros!");

        System.out.print("Digite os números do conjunto, separados por espaço.\nEx.: 5 10 15 20 25: ");
        String input = prompt.nextLine();
        String[] partes = input.split(" ");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }

        System.out.print("Agora, digite o valor de N (limite superior do intervalo): ");
        int n = prompt.nextInt();

        int primeiroNumero = numeros[0]; 

        int contagem = 0;
        for (int num : numeros) {
            if (num >= primeiroNumero && num <= n) {
                contagem++;
            }
        }

        System.out.println("Há " + contagem + " valores entre " + primeiroNumero + " e " + n + ".");
        
        System.out.println("--------------------------------");
        System.out.print("Digite 1 para realizar outra contagem ou 2 para sair: ");
        int opcao = prompt.nextInt();

        if (opcao == 1) {
            contagem(); 
        } else {
            System.out.println("Obrigado por usar o contador de valores inteiros!");
            prompt.close();
        }
    }
}
