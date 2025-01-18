import java.util.Scanner;

public class singleDig {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit number (0-9): ");
        int number = scanner.nextInt();

        
        if (number >= 0 && number <= 9) {
        
            String[] words = {"Zero", "One", "Two", "Three", "Four", 
                               "Five", "Six", "Seven", "Eight", "Nine"};
            
        
            System.out.println("The number in word is: " + words[number]);
        } else {
            System.out.println("Invalid input! Please enter a single-digit number (0-9).");
        }

        
        scanner.close();
    }
}
