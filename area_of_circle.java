import java.util.Scanner;

public class area_of_circle {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double radius, area;

    System.out.print("Enter Radius Value: ");
    radius = input.nextDouble();

    area = Math.PI * radius * radius;

    System.out.println("Area of triangle is: " + area);
}
}