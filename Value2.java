public class Value2{
    public static void main(String[] args){
        int k = 543;
        for(int i=k;i>0;i/=10){
            System.out.println(i%10);
        }
    }
}