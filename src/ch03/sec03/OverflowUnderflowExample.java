package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        //-128 ~127
        byte var1 = 125;

        for(int i = 0; i<5; i++) {
            var1++;
            System.out.printf("var1: %d\n", var1);
        }
            byte var2 = -125;
            for(int i = 0; i<5; i++){
                var2--;
                System.out.printf("var2: %d\n",var2);
        }
    }
}
