import java.util.Scanner;


//1. what do we want to do? how can we do it?
// a. create a scanner class
// b. print out / ask the user for integer input
// c. what happens when it is bad input--repeat question in loop
// d. what happens with the right input--return interger value

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receive integer input
        System.out.println("Please enter an integer:");
        int intValue = getIntInput(scanner);
        System.out.println("You entered the integer: " + intValue);


        scanner.close();
    }

    // Method to handle integer input
    // Logic explained:
    // while true -> will always run the loop, the only escape is return statement which requires an int
    private static int getIntInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer:");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}

