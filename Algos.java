import java.util.Arrays;

public class Algos {
    public static void selectionSort(int[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length; ++i) {
            int unsortedIdx = i + 1;
            int minIdx = i;

            for (int j = unsortedIdx; j < arr.length; ++j) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        printArray(arr);
        for (int i = 1; i < arr.length; ++i) {
            int j;
            for (j = i; (j > 0) && (arr[j - 1] > arr[i]); --j) {
                arr[j] = arr[j - 1];
            }
            arr[j] = arr[i];
        }
        printArray(arr);
    }

    public static void swap(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if (isSorted(arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}