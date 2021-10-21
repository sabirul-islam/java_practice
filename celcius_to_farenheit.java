import java.util.Scanner;

public class celcius_to_farenheit {
    public static void main(String[] args) {
        /*
        celcius to farenheit
        F = (9/5)*c + 32;

        farenheit to celcius
        c = (5/9)*(f-32);
        */

        Scanner input = new Scanner(System.in);
        Double celcius, farenheit;

        System.out.print("Enter Your Celcius Value: ");
        celcius = input.nextDouble();

        farenheit = 1.8 * celcius + 32;
        System.out.println("Farenheit: " + farenheit);

        input.close();
    }
}
