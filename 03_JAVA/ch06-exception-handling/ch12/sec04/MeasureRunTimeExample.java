package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        int sum = 0;
        long start = System.nanoTime();

        for (int i =0; i<=1000000; i++){
            sum += i;
        }
        long end = System.nanoTime();

        System.out.println("1부터 1000000의 합은 : " + sum);
        System.out.println("수행시간: " + (end - start) + " ns");
    }
}

