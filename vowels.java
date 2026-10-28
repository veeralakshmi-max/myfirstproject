public class vowels{
    public static void main(String[] args) {
        String s = "Hello World";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' || ch == 'A' ||
                    ch == 'E' || ch == 'I' || ch == 'O' ||
                    ch == 'U') {
                    vowels++;
                    System.out.println("vowels="+ch);
                } else {
                    consonants++;
                    System.out.println("consonent="+ch);
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
