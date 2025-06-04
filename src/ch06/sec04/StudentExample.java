package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();//객체화 대문자로 시작-레퍼런스타입 스튜던트객제주소값만 담을수있따
        Student s2 = new Student();

        s1.introduce();
        s2.introduce();

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();
    }
}
