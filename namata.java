import java.util.Scanner;

public class namata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

        input.close();
    }
}
