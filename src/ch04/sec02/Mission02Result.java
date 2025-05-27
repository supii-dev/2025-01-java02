package ch04.sec02;

import java.util.Scanner;

public class Mission02Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 >");
        int score = scanner.nextInt();
        if(score > 100 || score <0){
            System.out.println("잘못된 점수입니다");
        } else if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
