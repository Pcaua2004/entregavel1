import java.util.Scanner;

public class PrimoChecker{
    public void primoChecker() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("--------------------------------\nBem-vindo(a) ao PrimoChecker!");
        System.out.print("Digite um número: ");
        while (true) {
            
            int numero = prompt.nextInt();
            int divisores = 0;
    
            for (int count = 1; count <= numero; count++) {
                if (numero % count == 0) {
                    divisores++;
                }
            }
    
            if (divisores == 2) {
                System.out.println(numero + " é primo!\n--------------------------------");
                break;
            } else {
                System.out.println(numero + " não é primo, tente novamente.\n--------------------------------");
            }
            System.out.print("Digite outro número: ");
        }
        prompt.close(); 
    }
}
