package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = score > 90 ? 'A' // ture 면 A 사용
                                  : score > 80 ? 'B'  //ture 면 B 사용
                                                : 'C';

        char grade2;
        if(score>90){
            grade2 = 'A';
        }else {
            if(score>80){ //성능차이 별로없음
                grade2 = 'B';
            } else {
                grade2 = 'C';
            }
        }
        System.out.println("grade: " + grade);
        System.out.println("grade2: " + grade2);
    }
}
