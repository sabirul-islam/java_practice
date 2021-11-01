import java.util.Scanner;

public class total_prime_number {
    public static void main(String[] args) {
        //m-n prime number check;

        Scanner input = new Scanner(System.in);

        int m, n, count=0, totalPrime=0;

        System.out.print("Enter first number: ");
        m = input.nextInt();

        System.out.print("Enter second number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++){
            for (int j = 2; j <= i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.print(i+" ");
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("\nTotal prime: " + totalPrime);

        input.close();
    }
}
