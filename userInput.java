import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);

        //string input
        String name;
        System.out.println("enter your name");
        name = input.nextLine();
        System.out.println("welcome "+name);
        input.close();

        //integer input
        int intNumber;
        System.out.println("Enter Any Integer Number: ");
        intNumber = input.nextInt();
        System.out.println("Number : "+ intNumber);

        //double input
        double doubleNumber;
        System.out.println("Enter any double number: ");
        doubleNumber = input.nextDouble();
        System.out.println("Double Number: " + doubleNumber);
        
    }
}
