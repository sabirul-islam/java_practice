import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, count=0;
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 2; i < num; i++){
            if (num%i == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime number.");
        }else{
            System.out.println("Not a prime number.");
        }

        input.close();
    }
}
