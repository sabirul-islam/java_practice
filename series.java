import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int sum = 0, n;
        // double sum = 0, n;
        double n, res = 1;

        System.out.print("Enter last number: ");
        // n = input.nextInt();
        n = input.nextDouble();

        /*
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

        //2+4+6+.......+n;
        for (int i = 2; i <= n; i = i+2){
            sum = sum + i;
        }
        System.out.println(sum);
        
        //1.5+2.5+3.5+........+n;
        for (double i = 1.5; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);       

        //1*1 + 2*2 + 3*3 +.......n;
        for(int i = 1; i <= n; i++){
            System.out.print(i+"x"+i+" ");
            sum = sum + i*i;
        }
        System.out.println("result: "+sum);
        */

        for (double i = 1.5; i <= n; i++){
            res = res * i;
        }
        System.out.println(res);

        input.close();
    }
}
