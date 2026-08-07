import java.util.Arrays;
import java.util.List;
public class evensum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.stream()
               .filter(n -> n % 2 == 0)   // Keep only even numbers
               .map(n -> n * n)           // Square each even number
               .forEach(System.out::println); // Print the result
    }
}
