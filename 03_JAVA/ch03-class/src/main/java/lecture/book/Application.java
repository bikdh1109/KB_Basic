package lecture.book;

public class Application {

    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.title = "해리포터와 마법사의 돌";
        myBook.author = "조엔 K 롤링";
        myBook.coverType = "하드커버";
        myBook.pageCount = 320;
        myBook.getTitle();


        Book myBook2 = new Book();
        myBook2.title = "해리포터와 혼혈왕자";
        myBook2.author = "조엔 K 롤링";
        myBook2.coverType = "하드커버";
        myBook2.pageCount = 320;
        myBook2.getTitle();

        Book myBook3 = new Book("조엔 K 롤링","해리포터와 비밀의 방","하드커버",400);
        myBook3.getTitle();
        System.out.println(myBook3.toString());
    }

    ;
}
