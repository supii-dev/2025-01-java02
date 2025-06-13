package ch06.sec09;

public class Car {
    public String model;
    public int speed;

    public Car(String model) {
        this.model = model;
    }

    //speed 멤버필드 setter 메소드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        this.setSpeed(100);
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n"
                , this.model, this.speed);
    }
}