package ch04.sec09;

import ch04.sec04.method.Mission05Method;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {

        int[] arr = MakeArrayFromTo(5, 8); //5,6,7
        int[] arr2 = MakeArrayFromTo(15, 20); // 15,16,17,18,19
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        shuffleArray(arr);
        shuffleArray(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


    }

    public static int[] MakeArrayFromTo(int from, int to) {
        int[] arr = new int[to - from];
        int val = from;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = val++;
        }
        return arr;
    }

    public static void shuffleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;


        }
    }
}