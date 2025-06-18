package ch07.sec07.poly2;
//티비는 프로덕트를 상속받는다
//티비의 가격은 100만원 입니다 무조건
//티비 객체의 주소값을 println 찍으면 티비가 출력되어야한다 >toString 메소드 오버라이딩
public class Tv extends Product {
    public Tv(){
        super(100);
    }
    @Override
    public String toString(){
        return "Tv";
    }



}
