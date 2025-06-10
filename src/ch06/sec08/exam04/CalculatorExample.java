package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        //한변의 길이가 40인 정사각형의 넓이

        Calculator cal = new Calculator();
        double result = cal.arearectangle(40);
        System.out.println("result:"+result);

        double result2 = cal.areaRectangle(40,50);
        System.out.println("result2:"+result2);
    }
}
