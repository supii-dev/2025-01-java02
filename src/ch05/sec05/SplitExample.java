package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "번호, 제목, 내용, 성명";
        board.split(",");
        String[] arr = board.replace("","").split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
