public class binary_hexadecimal_octall {
    public static void main(String[] args) {
        int number = 1_000_100;

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("Binary: "+binary);
        System.out.println("Hex: "+hex);
        System.out.println("Octal: "+octal);
    }
}
