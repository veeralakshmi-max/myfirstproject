import java.util.*;
public class divi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(;n>0;n=n/10){
            sum=sum+n%10;
        }
        System.out.println("sum="+sum);
        if(sum%3==0)
        System.out.println("divisible by 3");
        else
        System.out.println("not divisible by 3");
    }
}
