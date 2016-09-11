import java.lang.reflect.Array;

/**
 * Created by 1 on 11.09.2016.
 */
public class SortingMethods {

    public int[] BubbleSort(int [] ar){
        int arrayLength = Array.getLength(ar);
        for (int i = (arrayLength - 1); i >= 0; i--){
            for (int j = 1; j <= i; j++) {
                if (ar[j-1] > ar[j]) {
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }

    public int[] SelectionSort(int[] ar){
        int arrayLength = Array.getLength(ar);
        for (int i = 0; i < arrayLength-1; i++)
        {
            int min = i;
            for (int j = i+1; j < arrayLength; j++)
            if (ar[j] < ar[min]) min = j;
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        return ar;
    }

    public int[] InsertionSort(int[] ar){
        int arrayLength = Array.getLength(ar);
        for (int i=1; i < arrayLength; i++) {
            int index = ar[i]; int j = i;
            while (j > 0 && ar[j-1] > index) {
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = index;
        }
    return ar;
    }


}
