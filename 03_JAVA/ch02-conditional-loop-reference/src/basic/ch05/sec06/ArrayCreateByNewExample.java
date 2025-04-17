package basic.ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1= new int[3];
        String[] arr2 = new String[3];

        for (int i : arr1){
            System.out.println(i);
        }
        for(String i : arr2){
            System.out.println(i);
        }

    }
}