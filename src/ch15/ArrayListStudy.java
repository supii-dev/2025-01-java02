package ch15;
import blackjack.Card;
import java.util.*;

public class ArrayListStudy {
    public static void main(String[] args){//다형성
        List<String> list = new LinkedList<>();
        Card card = new Card("","");
        System.out.println("list.size():" + list.size());
        list.add("가");//
        list.add("나");
        System.out.println("list.size():" + list.size());
        System.out.println("list.get(0):" + list.get(0));
        System.out.println("list.get(1):" + list.get(1));


    }
}
