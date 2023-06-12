package ED_AtvA3;
import java.util.Arrays;
public class selectionSort {

    public static void main(String[] args) {
        String[] lista = {"O", "R", "D", "E", "N", "A"};
        System.out.println("Lista original: " + Arrays.toString(lista));
        selecao(lista);
        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }

        public static void selecao(String[] lista) {
            for (int i = 0; i < lista.length - 1; i++) {
                int menorIndex = i;
                for (int j = i + 1; j < lista.length; j++) {
                    if (lista[j].compareTo(lista[menorIndex]) < 0) {
                        menorIndex = j;
                    }
                }
                if (menorIndex != i) {
                    String temp = lista[i];
                    lista[i] = lista[menorIndex];
                    lista[menorIndex] = temp;
                }
            }
        }
    }

