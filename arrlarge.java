public class arrlarge{
    public static void main(String[] args){
        int mark[] = {7,8,15,17,91,45};
        int max=mark[0];
        for(int i=1;i<mark.length;i++){
            if(mark[i]>max){
                max=mark[i];
            }
        }
        System.out.println("largest element="+max);
        }
}