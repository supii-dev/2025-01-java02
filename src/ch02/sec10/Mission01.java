package ch02.sec10;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요>");
        String strNum = scanner.next(); //입력받은 문자열을 정수로 파싱하여 x2한 값을 출력

        int num = 0;
        try {
            num = Integer.parseInt(strNum);
            System.out.println(num * 2);
        } catch (Exception e){
            System.out.println("숫자를 입력해 주세요>");
        }


//        int num = Integer.parseInt(strNum); //문자열과 같이 쓸수있는 연산자는 + 뿐 무엇이와도 문자열로 바뀜
//        System.out.println(num * 2);
//        System.out.printf("%d\n",num * 2);


    }
}
