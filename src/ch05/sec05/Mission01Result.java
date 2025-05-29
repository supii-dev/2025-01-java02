package ch05.sec05;

import java.util.Scanner;

public class Mission01Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("주민번호를 입력하시오.(xxxxxx-xxxxxxx)> ");
        String ssn = scanner.nextLine();
        if(ssn.length()!=14){
            System.out.println("잘 못 입력하셨습니다.");
            return;
        }

    }

}
