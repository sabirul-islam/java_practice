import java.util.Scanner;

public class even_odd_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, result;

        result = 0;

        System.out.print("Enter initial number: ");
        n = input.nextInt();

        System.out.print("Enter final number: ");
        m = input.nextInt();

        //even number
        System.out.print("Even number: ");
        for (int i = n; i <= m; i++){
            if(i % 2 == 0){
                result = result + i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        //odd number
        System.out.print("Odd number: ");
        for (int i = n; i <= m; i++){
            if(i % 2 != 0){
                result = result + i;
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
