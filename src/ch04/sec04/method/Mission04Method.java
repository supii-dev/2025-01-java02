package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("==============================");
        gugudan(4,9);
        gugudan(2,4);

    }

    public static void gugudan(int i) {
        for (int k = 1; k < 10; k++) {
            System.out.printf("%dx%d=%d\n", i, k, i * k);



        }

    }
    public static void gugudan(int from,int to){
        for(int i = 1; i<=to; i++){

            gugudan(i);
        }
        System.out.println("------------------------");
    }
}
