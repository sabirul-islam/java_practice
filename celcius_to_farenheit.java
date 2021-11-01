import java.util.Scanner;

public class celcius_to_farenheit {
    public static void main(String[] args) {
        /*
        celcius to farenheit
        F = (9/5)*c + 32;
        */

        Scanner input = new Scanner(System.in);
        double celcius, farenheit;

        System.out.print("Enter Your Celcius Value: ");
        celcius = input.nextDouble();

        farenheit = (celcius * 9/5) + 32;
        System.out.println("Farenheit: " + farenheit);

        input.close();
    }
}
