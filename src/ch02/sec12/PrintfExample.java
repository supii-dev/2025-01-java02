package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.println("상품의 가격:" + value + "원");
        System.out.printf("상품의 가격:%d원\n",value);
        System.out.printf("상품의 가격:%,d원\n",value); // 천단위 콤마 프린트f엄청추천 //콘솔에 데이터를 찍는게 목적 //출력이목적

        String result = String.format("상품의 가격:%,d원\n",value); //안드로이드 개발하면 사용할수도잇슴 //가공가능 //문자열을 만드는게 목적
        System.out.println(result);

        System.out.printf("상품의 가격:%11d원\n",value); // 나 9칸 쓰겠다
        System.out.printf("상품의 가격:%-11d원\n",value);
        System.out.printf("상품의 가격:%011d원\n",value);

        int year = 2025;
        int mon = 10;
        int day = 14;
        //2025-09-04
        System.out.printf("%d-%02d-%02d\n",year,9,4);
        System.out.printf("%d-%02d-%02d\n",year,mon,day);

        int radius = 10;
        double area = 3.14159 * 10 * 10;//반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이:%f\n", radius,area);
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", radius,area); // 10(10칸).2(실수는2자리까지 +반올림)
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", radius,area); //0이랑 -는 동시에 쓸수없음
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", radius,area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n",1,name,job);


    }
}
