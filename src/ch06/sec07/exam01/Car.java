package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    //오버로딩 (Overloading) 똑같은 이름의 메소드를 여러개 만들 수 있다.
    //조건은 파라미터가 타입의 순서와 갯수가 달라야한다. (매개변수명은 상관없음)
    public Car() {
    }

    public Car(boolean bbb, int ccc, String aaa) {  //파라미터는 무조건 달라야한다

    }

    public Car(String model, boolean start, int speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
