public class oddev{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int odd=0,even=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even+=a[i];
            }else{
                odd+=a[i];
            }
        }
        System.out.println("sum of even="+even);
        System.out.println("sum of odd="+odd);
    }
}