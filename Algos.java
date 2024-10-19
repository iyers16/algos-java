import java.util.Arrays;

public class Algos {
    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length; ++i) {
            int unsortedIdx = i + 1;
            int minIdx = i;

            for (int j = unsortedIdx; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
        printArray(arr);
    }

    public static <T extends Comparable<? super T>> void bubbleSort(T[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length; ++i) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        printArray(arr);
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
        printArray(arr);
        for (int i = 1; i < arr.length; ++i) {
            int j;
            T current = arr[i];
            for (j = i; (j > 0) && (arr[j - 1].compareTo(current) > 0); --j) {
                arr[j] = arr[j - 1];
            }
            arr[j] = current;
        }
        printArray(arr);
    }

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
