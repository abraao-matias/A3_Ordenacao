package ED_AtvA3;

import java.util.Random;
import java.util.Arrays;


class Main {
    private static int[] GerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();
//      adiciona um valor aleatorio entre 0-9 no index do array
        for (int i=0;i<tamanho;i++) {
             vetor[i] = aleatorio.nextInt(10);
        }

        return vetor;
    }

    private static void ImprimirVetor(int[] vetor) {
        for (int i=0;i<vetor.length;i++) {
            System.out.print(vetor[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int vetor[] = GerarVetor(8);
        System.out.println("Vetor gerado aleatóriamente:\n "+ Arrays.toString(vetor));
        System.out.println("\nVetor ordenado em InsertionSort:");
        ImprimirVetor(InsertionSort.insertionSort(vetor));

    }
}