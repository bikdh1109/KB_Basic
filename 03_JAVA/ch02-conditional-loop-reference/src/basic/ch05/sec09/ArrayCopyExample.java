package basic.ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java","array","copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray,0,oldStrArray.length);

        for (String i : newStrArray){
            System.out.printf("%s, ",i);
        }
    }
}
