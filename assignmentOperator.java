public class assignmentOperator {
    public static void main(String[] args) {
        /* Assignment Operator
         = => Y = X + 5;
         += => X += 5 => X + 5;
         -= => X -= 5 => X - 5;
         *= => X *= 5 => X * 5;
         /= => X /= 5 => X / 5;
         %= => X %= X % 5;
        */ 

        int x = 3;
        int y = 2;

        x += y; // x = x + y => 5;
        System.out.println("X = :" + x);

        x -= y; // x = x - y => 3;
        System.out.println("X = :" + x);

        x *= y; // x = x * y => 6;
        System.out.println("X = :" + x);

        x /= y; // x = x / y => 3;
        System.out.println("X = :" + x);

        x %= y; // x = x % y => 1;
        System.out.println("X = :" + x);
    }
}
