import java.util.Scanner;

public class Quicksort {
    
    public void quicksort() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Bem-vindo(a) ao Ordenador com Quicksort!");
        System.out.print("Digite os números que você deseja ordenar, separados por espaço:\nEx.: 10 3 5 2 8: ");
        String input = prompt.nextLine();

        String[] partes = input.split(" ");
        int[] array = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            array[i] = Integer.parseInt(partes[i]);
        }

        quicksort(array, 0, array.length - 1);

        System.out.println("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("--------------------------------");
        System.out.print("Digite 1 para ordenar outro array ou 2 para sair: ");
        int opcao = prompt.nextInt();

        if (opcao == 1) {
            quicksort(); 
        } else {
            System.out.println("Obrigado por usar o Ordenador com Quicksort!");
            prompt.close();
        }
    }

    private void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(array, inicio, fim);
            quicksort(array, inicio, indiceParticao - 1);
            quicksort(array, indiceParticao + 1, fim);
        }
    }

    private int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = (inicio - 1); 

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }
}
