package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);
        // 2,4 면여자 1,3이면 남자
        switch (gender){
            case '2','4' -> System.out.println("남자");
            case '1','3' -> System.out.println("여자");
        }
    }
}
