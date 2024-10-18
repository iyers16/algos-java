import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] unsortedArray = IntStream.generate(() -> random.nextInt(101))
                .limit(10)
                .toArray();
        // Algos.selectionSort(unsortedArray);
        // Algos.bubbleSort(unsortedArray);
        Algos.insertionSort(unsortedArray);
    }
}