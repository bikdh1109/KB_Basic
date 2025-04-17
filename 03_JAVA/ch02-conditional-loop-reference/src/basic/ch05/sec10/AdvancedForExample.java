package basic.ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {


        int[] scores = {95,71,84,93,87};

        int sum = 0;
        for (int i : scores){
            sum += i;
        }

        double average = (double) sum/scores.length;

        System.out.printf("배열의 총합은 : %d, 평균은 : %f", sum, average);
    }
}
