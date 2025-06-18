package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("-----------------------------");

        Parent parent = child; //담을수있고 자동형변환도됨
        //타입은 알고 있는 메소드만 호출할수 있다.
        parent.method1();
        parent.method2();
        //둘다 Child 에서 접근하기 때문에 결과가 같다
        //parent.method3(); 호출할수없다 알고있지않기때문에

        //method3() 호출하고싶다
        Child child2 = (Child)parent;
        child2.method3();
    }

}


//다형성
//1. 부모타입의 변수는 자식객체 주소값을 담을수 있다.
//2. 자식타입의 변수는 부모 객체 주소값을 담을수있다.
//3. 타입을 알고있는 메소드만 호출할수있다.