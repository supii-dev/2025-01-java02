package ch07.sec07.poly2;
//제품의 가격 정보를 저장할 수 있다.(price)
//제품 구매시 제공하는 보너스 점수 저장 할수있다.(bonusPoint) 정수
//캡슐화, immutable
//외부에 값을 보내줄수있다
// Product 는 객체화 금지 //abstract
public abstract class Product {
    private int price; //단위는 만원단위
    private int bonusPoint;

    public Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price * 0.1); // 가격의 10%

    }

    protected Product() {
    }

    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

}

