package ch07.sec07.poly2;

public class poly2Example {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Tv());

        System.out.println("잔액: " + buyer.getMoney());
        System.out.println("포인트 잔액: " + buyer.getBounsPoint());

    }
}
