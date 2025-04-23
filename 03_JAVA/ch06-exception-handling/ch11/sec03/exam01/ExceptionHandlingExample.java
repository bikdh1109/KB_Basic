package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};


        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        } catch (NumberFormatException e) {
            System.out.println("오류가 발생했습니다.");
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }


    }
}
