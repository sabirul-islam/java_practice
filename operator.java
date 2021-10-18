import java.util.Scanner;

public class operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Addition: " + result);

        result = num1 - num2;
        System.out.println("Substraction: " + result);

        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        result = num1 / num2;
        System.out.println("Dividation: " + result);

        result = num1 % num2;
        System.out.println("Remainder: " + result);

        input.close();
    }  
}
