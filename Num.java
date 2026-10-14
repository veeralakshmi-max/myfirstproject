import java.util.*;
public class Num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 20;
        if(a==0){
            System.out.println("zero");
        }else if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}