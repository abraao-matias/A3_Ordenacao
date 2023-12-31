package ED_AtvA3;

import java.util.Random;
import java.util.Arrays;
public class Shellsort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("Vetor desordenado: ");
        for(int i=0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i]+" ");
        }

        int h = 1;
        int n = vetor.length;
        while(h < n) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h/3);

        int elemento, j;
        while(h > 0){
            for(int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }
            h = h/2;
        }
        System.out.println("\n\nVetor ordenado: ");
        for(int i=0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }
    }

}