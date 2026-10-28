import java.util.Arrays;

class anagrams{
    public static void main(String[] args) {
        String s = "heart";
        String t = "earth";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}