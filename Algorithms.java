import java.util.Arrays;

public class Algorithms {
    public static <T extends Comparable<? super T>> T[] selectionSort(T[] arr) {

        for (int i = 0; i < arr.length; ++i) {
            int unsortedIdx = i + 1;
            int minIdx = i;

            for (int j = unsortedIdx; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            Utils.swap(arr, i, minIdx);
        }
        return arr;
    }

    public static <T extends Comparable<? super T>> T[] bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Utils.swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }

    public static <T extends Comparable<? super T>> T[] insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int j;
            T current = arr[i];
            for (j = i; (j > 0) && (arr[j - 1].compareTo(current) > 0); --j) {
                arr[j] = arr[j - 1];
            }
            arr[j] = current;
        }
        return arr;
    }
}
