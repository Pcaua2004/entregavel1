import java.util.Scanner;

public class Somatorio {
    public void somatorio(){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Bem-vindo ao somador de números!\nDigite os números que você quer somar, separados por espaço.\nEx.: 10 20 30");
        String input = scanner.nextLine();
        
        String[] numeros = input.split(" ");
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma = soma + Integer.parseInt(numeros[i]);
        }
        
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
