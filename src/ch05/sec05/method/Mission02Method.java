package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg");
        String ext2 = getExt("sad222.sdkf111.jpeg");
        System.out.println("ext: " + ext);
        System.out.println("ext2: " + ext2);

    }
    public static String getExt(String filename) {
        int lastDotIdx = filename.lastIndexOf(".");
        return filename.substring(lastDotIdx + 1);
    }


}
