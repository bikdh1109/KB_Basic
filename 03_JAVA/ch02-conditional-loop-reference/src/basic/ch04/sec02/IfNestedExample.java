package basic.ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*81)+20;
        System.out.println("점수:"+score);

        String grade="";
        if (score >= 95) {
            grade = "A+";
        }else if (score >= 90) {
            grade = "A";
        }else if (score >= 85) {
            grade = "B+";
        }else if (score > 80) {
            grade = "B";
        }
        System.out.println("학점:"+grade);
    }
}
