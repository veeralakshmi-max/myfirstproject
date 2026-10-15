import java.util.*;
public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int rev=0;
        for(;n!=0;n=n/10){
            rev = rev*10+n%10;
        }
        System.out.println("reverse="+rev);
    }
}