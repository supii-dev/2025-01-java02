package ch06.sec08.exam03;
/*
접근 제어자 (Access Modifier)
private - 같은 클래스 안에서만 접근 가능
default - private + 같은 패키지는 접근 가능 (잘 사용안함)
protected - default+상속관계는 접근가능
public - 무조건 접근가능

private 멤버 필드 값에 대입 방법 2가지
- 생성자
-(setter)메소드
private 멤버필드에 값 읽기 방법 1가지
-(getter)메소드
 */

public class Car {
    private int gas;
    private int oil;

    public int getGas() {
        return gas;
    }

    public int getOil() {
        return oil;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }


    public void setOil(int oil) {
        this.oil = oil;
    }

}


