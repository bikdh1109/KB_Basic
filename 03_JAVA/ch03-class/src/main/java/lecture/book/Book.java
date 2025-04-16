package lecture.book;

public class Book {

    // 필드
    String author;
    String title;
    String coverType;
    int pageCount;

    // 생성자 : 반드시 Class 명과 "동일" 해야함. 반환형을 작성하지 않음.
    // 반환형을 작성하게 되면 일반 메서드로 인식한다.
    // 기본 생성자 : 매개변수가 없는 생성자
    public Book() {
        System.out.println("기본 생성자 호출함....");
    }

    public Book(String author, String title) {
        System.out.println("매개변수 2개 받는 생성자 호출함...");
        this.author = author;
        this.title = title;
    }

    // 매개변수가 있는 생성자가 하나라도 있으면 Compiler가 자동으로 기본 생성자를 만들어주지 않는다.
    public Book(String author, String title, String coverType, int pageCount) {
        System.out.println("전체 매개변수 생성자 호출됨...");
        this.author = author;
        this.title = title;
        this.coverType = coverType;
        this.pageCount = pageCount;
    }
    // 생성자 오버로딩 - 같은 이름의 메소드나 생성자를 매개변수의 갯수나 타입에 따라 여러개 선언하는 것



    // 메서드
    public String getTitle() {
        System.out.println(title + " 책의 작가는 " + author + "입니다.");
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
