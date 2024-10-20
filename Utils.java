import java.util.Arrays;

public class Utils {
    public static <T> void swap(T[] arr, int indexA, int indexB) {
        T tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static <T extends Comparable<? super T>> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
        if (isSorted(arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}