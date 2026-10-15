import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        for(;temp>0;temp=temp/10){
            reverse = reverse*10+temp%10;
        }
        System.out.println(n==reverse);
    }
}