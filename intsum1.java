public class intsum1{
    public static void main(String[] args) {
        String s1 = "456";
        String s2 = "123";

        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            a = a * 10 + (s1.charAt(i) - '0');
        }

        int b = 0;
        for (int i = 0; i < s2.length(); i++) {
            b = b * 10 + (s2.charAt(i) - '0');
        }

        int sum = a + b;
        System.out.println("Sum of two numbers: " + sum);
    }
}