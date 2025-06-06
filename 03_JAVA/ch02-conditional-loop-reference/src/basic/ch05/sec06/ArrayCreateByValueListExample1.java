package basic.ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        int[] scores = {83, 90, 87};

        for (int i = 0; i < season.length; i++) {
            System.out.printf("season[%d] : %s\n", i, season[i]);
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

    }
}
