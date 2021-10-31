import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, n;
        System.out.print("Enter last number: ");
        n = input.nextInt();

        //1+2+3+......+n;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //1+3+5+.......n;
        for (int i = 1; i <= n; i=i+2) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 2; i <= n; i = i+2){
            sum = sum + i;
        }
        System.out.println(sum);

        input.close();
    }
}
