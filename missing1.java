import java.util.Arrays;
public class missing1{
    public static void main(String[] args) {

        int arr[] = {5, 3, -1, 2, 1, 8};
        int brr[] = {6, 1, 0, 2, 9, 5, 6, 3, 7, 4};

        findMissing(arr);
        findMissing(brr);
    }

    static void findMissing(int arr[]) {
        boolean check[] = new boolean[arr.length + 1];

        check[0] = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < check.length) {
                check[arr[i]] = true;
            }
        }

        System.out.println(Arrays.toString(check));

        for (int i = 1; i < check.length; i++) {
            if (check[i] == false) {
                System.out.println(i);
                break;
            }
        }
    }
}