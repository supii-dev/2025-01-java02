package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setGas(10);
        car1.setOil(20);

        int car1Gas = car1.getGas();
        System.out.println("car1Gas:"+car1Gas);
        System.out.println("car1Oil:"+car1.getOil());

        Car car2 = new Car();

        System.out.println(car2.getGas());
        System.out.println(car2.getOil());



    }

}
