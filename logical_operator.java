import java.util.Scanner;

public class logical_operator{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter A Valid Character: ");
        ch= input.next().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Small Letter.");
        } else if (ch>='A' && ch<='Z'){
            System.out.println("Capital Letter.");
        } else{
            System.out.println("Not A Valid Character.");
        }
        
        input.close();
    }
}