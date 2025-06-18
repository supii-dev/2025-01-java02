package ch07.sec07.poly2;

public class Buyer {
    private int money;
    //private int money = 1000;
    private int bounsPoint;

    public  Buyer() {
        this.money = 1_000;
    }

    public int getMoney() {
        return money;
    }

   public int getBounsPoint(){
        return bounsPoint;
   }

    public void buy(Product product){
        if(product.getPrice() > this.money ) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bounsPoint += product.getBonusPoint();

        System.out.println(product + "을(를) 구입하였습니다.");

        }

    }
