package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; //10칸 짜리 정수 배열을 만들고 싶다.

        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }
//        arr[0] = 1;
//        arr[1] = 2;
        System.out.println( Arrays.toString(arr) );
        int room = (int)(Math.random()*10.0);
        System.out.println(room);









/*
    0~9랜덤값 구한다. 예를들어 7이 나왔다. 0번반과 7번방 스와핑한다.
    0~9랜덤값 구한다. 예를들어 8이 나왔다. 1번반과 8번방 스와핑한다.
    0~9랜덤값 구한다. 예를들어 5이 나왔다. 2번반과 5번방 스와핑한다.
 */


        System.out.println( Arrays.toString(arr) );





    }
}