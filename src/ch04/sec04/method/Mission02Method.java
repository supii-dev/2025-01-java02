package ch04.sec04.method;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6);
        printNumberFromTo(12, 16);


    }

    public static void printNumberFromTo(int from, int to) {
        System.out.printf("[%d",from);
        for (int i = from+1; i <= to; i++) {
            System.out.printf(", %d", i);
        }
        System.out.println("]");
    }
}
