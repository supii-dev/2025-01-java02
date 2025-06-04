package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) { //프로그램의 시작점
        Calculator cal = new Calculator(); //객체화 Calculator()-기본생성자
        //Calculator cal(객체주소)레퍼런스변수 변수명( Calculator 주소값만 담을수있는 변수) = new(객체생성에쓴다) 다음에오는 생성자는 Calculator에잇는 놈만
        //()- 데이터 안줘도된다
        int result = cal.plus(1,2);
        System.out.println("result: "+result);
        System.out.println("result: "+cal.plus(10,20));
        System.out.println("result: "+30);

        cal.powerOn(); // 값을안준다
        cal.powerOff();
    }
}
