package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
        double r1 = division(10, 3);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + division(100, 32));
    }

    public static double division(int n1, int n2) {
        return (double)n1 / n2;
    }
}