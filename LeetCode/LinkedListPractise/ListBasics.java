package LinkedListPractise;
import java.util.*;

public class ListBasics {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Insert at index
        numbers.add(1, 15);

        // Access
        System.out.println("First element: " + numbers.get(0));

        // Update
        numbers.set(2, 25);

        // Remove
        numbers.remove(Integer.valueOf(15));

        // Iterate
        System.out.println("Numbers:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
