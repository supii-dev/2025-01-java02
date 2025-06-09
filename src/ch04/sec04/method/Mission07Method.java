package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = {90,88,100,70,60,90};

        double avr = getAverage(scores);
        System.out.println("avr"+avr);
    }
    public static double getAverage(int[] arr){
        int sum = Mission05Method.addAllUpArray(arr);
        return (double) sum / arr.length;
        }

    }


