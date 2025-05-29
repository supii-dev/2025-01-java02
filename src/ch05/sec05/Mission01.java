package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("주민번호를 입력하시오.(xxxxxx-xxxxxxx)>");
        String num = scanner.nextLine();
        char gender = num.charAt(7);
        System.out.println("gender: " + gender);
        switch (gender){
            case '2','4' -> System.out.println("여자");
            case '1','3' -> System.out.println("남자");
            default -> System.out.println("잘못입력하셨습니다");
        }
    }
}
