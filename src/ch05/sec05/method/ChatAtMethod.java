package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // 남자리턴
        String gender2 = checkGender("900212-2998756"); // 여자리턴
        System.out.println("gender: "+gender);
        System.out.println("gender2: "+gender2);
    }
    public static String checkGender(String gender) {
       String result = "";
        switch (gender.charAt(7)) {
            case '1', '3' -> result = "남자";
            case '2', '4' -> result = "여자";
            default -> result ="null";
        }
        return result;
    }
}

//public static String checkGender(String ssn) {
//    char ch = ssn.charAt(7);
//    return switch (ch){
//        case '1', '3' ->  "남자";
//        case '2', '4' -> "여자";
//        default -> "null";
//    };
//}
