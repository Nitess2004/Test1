import java.util.Scanner;
public class TestQ2{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int prod = 1;
        int number2 = number; 
        if (number == 0) {
            prod = 0;
        } else {
            while (number > 0) {
                int digit = number % 10; 
                prod *= digit;        
                number /= 10;             
            }
        }
        System.out.println("The product of the digits of " + number2 + " is: " + prod);
        input.close();
    }
} 