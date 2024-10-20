import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] unsortedArray = Stream.generate(() -> random.nextInt(101))
                .limit(10)
                .toArray(Integer[]::new);
        Utils.printArray(unsortedArray);
        Integer[] sortedArray = Algorithms.insertionSort(unsortedArray);
        Utils.printArray(sortedArray);
    }
}