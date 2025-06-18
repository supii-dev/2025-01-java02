package ch07.sec07.poly;

public abstract class Animal {

   private  int age;
    //추상메소드
    //추상메소드를 단 하나라도 가지고 있다면 그클레스는
    //추상클레스가 되어야 한다
    public abstract void crying();

}

// 다형성을 쓰는 이유는 규격화 하기위해서