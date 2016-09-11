import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 1 on 11.09.2016.
 */
public class Main {
    public static void main (String[] args){
        int [] array = {59,56,100,3,2,0,-40,10};
        SortingMethods Sort = new SortingMethods();

        System.out.println("Array before sort = " + Arrays.toString(array));
        System.out.println("Bubble Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.BubbleSort(array)));
        System.out.println("Selection Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.SelectionSort(array)));
        System.out.println("Insertion Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.InsertionSort(array)));



    }
}
