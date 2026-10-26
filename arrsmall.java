public class arrsmall{
    public static void main(String[] args){
        int mark[] = {7,8,15,17,91,45};
        int min=mark[0];
        for(int i=1;i>mark.length;i++){
            if(mark[i]<min){
                min=mark[i];
            }
        }
        System.out.println("smallest element="+min);
        }
}