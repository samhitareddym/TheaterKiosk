import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        //Check if the input is an integer
        if (in.hasNextInt()) {
            int age = in.nextInt();
            //If the user is 21 or older, display the wristband message
            if (age >= 21) {
                System.out.println("You get a wristband.");
            }
            // No action for ages under 21 (program does nothing in that case)
        } else {
            // If the input is not a valid integer, display an error message
            System.out.println("Please enter a valid integer for your age.");
        }
    }
}