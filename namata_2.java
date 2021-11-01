import java.util.Scanner;

public class namata_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first, last;

        System.out.print("Enter first number: ");
        first = input.nextInt();

        System.out.print("Enter last number: ");
        last = input.nextInt();

        for (int i = first; i <= last; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("\n");
        }

        input.close();
    }
}
