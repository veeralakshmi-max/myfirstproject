class strpalindrome {
    public static void main(String[] args) {

        String str1 = "madam";
        String str2 = "hello";
        String str3 = "level";

        String rev1 = "";
        String rev2 = "";
        String rev3 = "";

        for (int i = str1.length() - 1; i >= 0; i--)
            rev1 = rev1 + str1.charAt(i);

        for (int i = str2.length() - 1; i >= 0; i--)
            rev2 = rev2 + str2.charAt(i);

        for (int i = str3.length() - 1; i >= 0; i--)
            rev3 = rev3 + str3.charAt(i);

        System.out.println(str1.equals(rev1) ? "Palindrome" : "Not Palindrome");
        System.out.println(str2.equals(rev2) ? "Palindrome" : "Not Palindrome");
        System.out.println(str3.equals(rev3) ? "Palindrome" : "Not Palindrome");
    }
}