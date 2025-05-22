package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x: %d, y: %d\n",x,y);
        int z = y;
        y = x;
        x = z;
        System.out.printf("x: %d, y: %d\n",x,y);
    }
}
