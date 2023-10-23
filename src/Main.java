import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        int largest = 0;
        int smallest = 100;

        // Generate and compare 10 random integers
        int count = 0;
        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            System.out.println(randomNumber);
            if (randomNumber > largest) {
                largest = randomNumber;

            }

            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            count++;
        }


        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
