package ch03;

public class Confirmation03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        //학생 한명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students ; //남은수
        System.out.println(pencilsLeft);
    }
}
