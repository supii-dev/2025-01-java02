package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); //10:20
        printTime(2, 9); //02:09

        printTime(2, 9, 2);
        printTime(12, 9, 22);
    }
//
//    public static void printTime(int hour, int min, int sec) {
//        if (hour < 10) {
//            System.out.print("0" + hour);
//        } else {
//            System.out.print(hour);
//        }
//        System.out.print(" : ");
//        if (min < 10) {
//            System.out.print("0" + min);
//        } else {
//            System.out.print(min);
//        }
//        System.out.print(" : ");
//        if (sec < 10) {
//            System.out.print("0" + sec);
//        } else {
//            System.out.print(sec);
//        }
//        System.out.println();
//    }
//
//
//        public static void printTime ( int hour, int min){
//            //System.out.printf("%02d:%02d\n",hour,min);
//            if (hour < 10) {
//                System.out.print("0" + hour);
//            } else {
//                System.out.print(hour);
//            }
//            System.out.print(" : ");
//            if (min < 10) {
//                System.out.print("0" + min);
//            } else {
//                System.out.print(min);
//            }
//            System.out.println();
//        }
//    }
public static void printTime(int hour, int min, int sec){
    String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
    System.out.print(strHour+":");
    printTime(min,sec);
    }
    public static void printTime(int time1, int time2){
        String strTime1 = time1 < 10 ? "0" + time1 : String.valueOf(time1);
        String strTime2 = time2 < 10 ? "0" + time2 : String.valueOf(time2);
        System.out.println(strTime1+":"+strTime2);
    }
}