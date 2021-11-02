import java.util.Scanner;

public class inch_to_meter {
    public static void main(String[] args) {
        //1 inch = 0.0254 meter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a inch value: ");
        double inch = input.nextDouble();

        double meter = inch * 0.0254;
        System.out.println("Meter: " + meter);

        input.close();
    }
}
