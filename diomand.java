import java.util.*;
public class diomand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int k=1;
        int space=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<k;j++){
                System.out.print("*"+" ");
            }
            k+=i<n/2?2:-2;
            space+=i<n/2?-1:1;
            System.out.println();
        }
   }
}