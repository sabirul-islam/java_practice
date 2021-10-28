import java.util.Scanner;

public class sum_loop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <=10; i++){
            sum = sum + i;
            System.out.println(sum);
        }

        Scanner input = new Scanner(System.in);
        int m, n, result;

        result = 0;

        System.out.print("Enter initial number: ");
        m = input.nextInt();

        System.out.print("Enter final number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            result = result + i;
            System.out.println(result);
        }

        input.close();
    }
}
