package ad211.vietokhin;

public class ArrayProduct implements Folder {
    public static int getProduct(int[] arr) {
        int pro = 1;
        for(int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        return pro;
    }
    @Override
    public int[] fold(int[] arr) {
        return arr;
    }
}
