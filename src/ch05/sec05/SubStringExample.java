package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String str = "ABC DEFGHIJKLMN";
        String str2 = str.substring(8);
        System.out.println(str);
        System.out.println(str2);

        String str3 = str.substring(11);
        System.out.println(str3); //LMN

        String str4 = str.substring(0, 6);
        System.out.println(str4); //ABCDEF
    }
}