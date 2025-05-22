package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';
        //단하나의 문자만 넣을수있음 문자1개당 숫자하나 배당

        System.out.printf("ch1: %c, %d\n",ch1,(int)ch1);
        System.out.printf("66: %c, %d\n",66,66);
        System.out.printf("67: %c, %d\n",67,67);

        char ch2 = 68;
        System.out.printf("ch2: %c, %d\n",ch2,(int)ch2);
        // 아스키코드
        char ch3 = '가';
        System.out.printf("ch3: %c, %d\n",ch3,(int)ch3);
        System.out.printf("힣: %c, %d\n",'힣',(int)'힣');

        String str = "Hello";
        char[] strArr = str.toCharArray();
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);

        String str2 = "";
        char ch4 = ' ';
        System.out.printf("ch4: %d\n", (int)ch4);

        String ch5 = "😀";
        System.out.println(Arrays.toString(ch5.toCharArray()));


    }
}
