package basic.ch14.sec03.syncronization;

public class SafeAccount {
    private int balance = 10000;

    /*
        Synchronized : 한번에 하나의 스레드만 특정 코드 영역에 들어올 수 있도록 막아주는 키워드
        - 락(locK)으로 보호
     */

    public synchronized void withdraw (int money) {
        // 공유자원 : 여러 스레드가 동시에 접근할 수 있는 데이터 (공통으로 사용하는 자원)
        // 임계 영역 : 반드시 한번에 한 스레드만 실행되어야 데이터 꼬임을 방지
        if(balance >= money){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            balance -= money;
        }else {
            System.out.println("출금할 수 없습니다.");
        }

    }

    public int getBalance(){
        return balance;
    }
}
