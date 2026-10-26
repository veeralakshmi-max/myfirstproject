public class main1{
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int arr[]={-7,4,3,2,0,-15};
        for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
    }
    System.out.println(max);
}
}

