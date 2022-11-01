package ad211.vietokhin;

public class ArraySum implements Folder {
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @Override
    public int[] fold(int[] arr) {
        return arr;
    }
}
