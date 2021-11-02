public class arithmetic_demo {
    public static void main(String[] args) {
        // addition
        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
        int result2 = result;

        //substraction
        result = result - 1;
        System.out.println(result2+" - 1 = "+result);
        result2 = result;

        // multiplication
        result = result * 2;
        System.out.println(result2+" * 2 = "+result);
        result2 = result;

        // dividation
        result = result / 2;
        System.out.println(result2+" / 2 = "+result);
        result2 = result;

        result = result + 8;
        System.out.println(result2+" + 8 = "+result);
        result2 = result;

        // reamainder
        result = result % 7;
        System.out.println(result2+" % 7 = "+result);
    }
}
