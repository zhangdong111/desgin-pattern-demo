package com.zhang.design.patterns.creator.prototype.example3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mail implements  Cloneable{
    //发送人
    private Sender sender;

    //收件人
    private Receiver receiver;

    //邮件名称
    private String subject;

    //邮件内容
    private String context;

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        try{
            mail = (Mail)super.clone();
            mail.context = "新的字符串";
            return mail;
        }catch (CloneNotSupportedException e){
            System.err.println("发生异常 = > " + e.toString());
            return null;
        }
    }

}
