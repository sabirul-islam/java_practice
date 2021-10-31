import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fact=1;

        System.out.print("Entere a number: ");
        num = input.nextInt();

        //5! = 5*4*3*2*1;
        for (int i = num; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);

        input.close();
    }
}
