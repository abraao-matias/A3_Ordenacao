package ED_AtvA3;

class InsertionSort {
    public static int[] insertionSort(int array[]){
        // int n = array.length;

        for (int i = 1; i < array.length; i ++){
            int eleito = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > eleito)){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = eleito;
        }

        return array;
    }
}
