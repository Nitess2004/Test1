import java.util.Scanner;
public class TestQ1{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        double sqrt = Math.sqrt(number);
        if (sqrt == (int) sqrt) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        input.close();
    }
}
