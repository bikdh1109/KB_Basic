package org.lecture.after;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 동일한 타입의 Bean 중 우선 주입됨
public class SMSSender extends EmailSender{
    // SMS 발송 기능
    @Override
    public void send(String message){
        System.out.println("SMS 발송 : " + message);
    }
}
