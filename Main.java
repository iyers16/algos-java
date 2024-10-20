// import java.util.Random;
// import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Random random = new Random();
        // Integer[] unsortedArray = Stream.generate(() -> random.nextInt(101))
        // .limit(10)
        // .toArray(Integer[]::new);
        // Utils.printArray(unsortedArray);
        // Integer[] sortedArray = Algorithms.insertionSort(unsortedArray);
        // Utils.printArray(sortedArray);

        Integer[] a = { 2, 4, 5, 13 };
        Integer[] b = { 3, 7, 9, 11, 12 };
        Utils.printArray(Algorithms.mergeSortedArrays(a, b, a.length, b.length));
    }
}