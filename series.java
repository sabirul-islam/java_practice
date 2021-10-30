import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        //1+2+3+......+n;
        Scanner input = new Scanner(System.in);

        int sum = 0, n;

        System.out.print("Enter last number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        input.close();
    }
}
