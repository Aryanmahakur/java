import java.util.Scanner;

// Class for Day Switch Program
class DayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number (1-7) to get the corresponding day:");
        int day = sc.nextInt(); // Taking input

        // Switch statement to match the number with a day
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close(); // Closing Scanner
    }
}

// Class for Factorial Using Recursion
class RecursionExample {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0)  // Base case
            return 1;
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}

