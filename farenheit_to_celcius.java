import java.util.Scanner;

public class farenheit_to_celcius {
    public static void main(String[] args) {
        /*
        farenheit to celcius
        c = (5/9)*(f-32);
        */

        Scanner input = new Scanner(System.in);
        Double farenheit, result;

        System.out.print("Enter Your Farenheit Value: ");
        farenheit = input.nextDouble();

        result = .56 * (farenheit-32);
        System.out.println(result + " Degree Celcius.");

        input.close();
    }
}
