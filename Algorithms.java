import java.lang.reflect.Array;

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
            int j = i;
            T current = arr[i];
            for (j = i; (j > 0) && (arr[j - 1].compareTo(current) > 0); --j) {
                arr[j] = arr[j - 1];
            }
            arr[j] = current;
        }
        return arr;
    }

    public static <T extends Comparable<? super T>> T[] mergeSort(T[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static <T extends Comparable<? super T>> T[] mergeSort(T[] arr, Integer leftIdx, Integer rightIdx) {
        if (leftIdx == rightIdx) {
            @SuppressWarnings("unchecked")
            T[] singleElementArray = (T[]) Array.newInstance(arr.getClass().getComponentType(), 1);
            singleElementArray[0] = arr[leftIdx];
            return singleElementArray;
        }

        if (leftIdx.compareTo(rightIdx) < 0) {
            Integer middleIdx = (leftIdx + rightIdx) / 2;
            T[] a = mergeSort(arr, leftIdx, middleIdx);
            T[] b = mergeSort(arr, middleIdx + 1, rightIdx);
            return mergeSortedArrays(a, b);
        }
        return null;
    }

    public static <T extends Comparable<? super T>> T[] mergeSortedArrays(T[] a, T[] b) {
        Integer sizeA = a.length;
        Integer sizeB = b.length;
        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), sizeA + sizeB);

        Integer ctrA, ctrB, ctrC;
        ctrA = ctrB = ctrC = 0;

        while (ctrA < sizeA && ctrB < sizeB) {
            if (a[ctrA].compareTo(b[ctrB]) <= 0) {
                c[ctrC++] = a[ctrA++];
            } else {
                c[ctrC++] = b[ctrB++];
            }
        }

        while (ctrA < sizeA) {
            c[ctrC++] = a[ctrA++];
        }
        while (ctrB < sizeB) {
            c[ctrC++] = b[ctrB++];
        }

        return c;
    }
}
