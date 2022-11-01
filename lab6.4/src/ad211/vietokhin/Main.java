package ad211.vietokhin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;

        Scanner intScanner = new Scanner(System.in);

        System.out.println("Input size of array");
        size = intScanner.nextInt();

        int[] myArray = new int[size];

        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Input " + i + " element of array");
            myArray[i] = intScanner.nextInt();
        }

        for(int i = 0; i < myArray.length; i++) {
            System.out.print("[" + i + "]" + myArray[i] + " ");
        }

        System.out.println("\nSum of array elements: " + ArraySum.getSum(myArray));
        System.out.println("Product of array elements: " + ArrayProduct.getProduct(myArray));
    }
}