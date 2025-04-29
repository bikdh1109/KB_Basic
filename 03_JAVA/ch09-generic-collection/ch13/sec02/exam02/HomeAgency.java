package basic.ch13.sec02.exam02;

public class HomeAgency implements Rentable{
    @Override
    public Home rent() {
        return new Home();
    }
}
