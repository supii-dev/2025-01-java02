package ch06.sec08;

public class Calculator {
    //void 메소드
    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    //리턴메소드
    public int plus(int n1,int n2){//꼭 두개보내야함 두개보내달라고 햇은까
        int result = n1+n2;
        return result;
    }
}
//일만하겟다 값저장용아님
//생성자를 안적으면 기본으로 생김