import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int oddSum = 0, evenSum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("sum of even number"+evenSum);
        System.out.println("sum of odd number"+oddSum);
    }
}