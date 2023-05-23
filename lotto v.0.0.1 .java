import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        // create a set to store unique numbers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // generate random numbers until we have 6 unique ones
        while (uniqueNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 49) + 1;
            uniqueNumbers.add(randomNumber);
        }

        // print the 6 unique numbers
        System.out.println("The 6 unique numbers are:");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}