package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b= new B();
        C c= new C();
        D d= new D();
        E e= new E();

        A a1 = b; // 부모 타입은 객체 주소값 담을 수 있다 > 다형성

        A a2 = e;
        //E e2 =(E)a2;//자식이 부모타입 객체주소값을 담을수없다 자동형변환 안됨 강제형변환하면 되긴함
        //D d2 = e;//안된다
    }
}
class A { }
class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { }


