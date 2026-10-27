public class occurence{
    public static void main(String[] args){
     int a[]={10,20,10,40,20,20,10};
     int search = 10;
     int count = 0;
     for(int i=0;i<a.length;i++){
        if(a[i]==search){
            count++;
        }
     }   
     System.out.println("occurrence="+count);
    }
}