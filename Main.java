package ED_AtvA3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static int[] GerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<tamanho;i++) {
            vetor[i] = sc.nextInt();
            //possibilita adicionar valores aleatorios de 0-9 no vetor
            // vetor[i] = aleatorio.nextInt(10);
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
        System.out.println("Vetor ordenado:");
        ImprimirVetor(InsertionSort.insertionSort(vetor));

    }
}