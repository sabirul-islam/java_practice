import java.util.Scanner;

public class control_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number%2 == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }

        if (number>0) {
            System.out.println("Positive number");
        } else if (number<0) {
            System.out.println("Negative number");
        } else{
            System.out.println("Equql to zero");
        }

        input.close();
    }
}
