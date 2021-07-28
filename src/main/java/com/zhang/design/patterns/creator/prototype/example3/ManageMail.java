package com.zhang.design.patterns.creator.prototype.example3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManageMail implements Runnable {

    private String subject;

    private String context;

    private Sender sender;

    private List<Receiver> receivers;


    private void sendMail(){
        Mail mail =  new Mail();
        mail.setContext(this.context);
        mail.setSubject(this.subject);
        mail.setSender(this.sender);
        for (Receiver receiver : receivers) {
//            mail = mail.clone();
            mail.setReceiver(receiver);
//            System.out.println("我是线程 : = >" + Thread.currentThread().getName());
//            System.out.println("发送人 : " + mail.getSender().getName());
//            System.out.println("发送人邮箱 : " + mail.getSender().getEmail());
//            System.out.println("标题 : " + mail.getSubject());
//            System.out.println("内容 : " + mail.getContext());
//            System.out.println("接收人 : " + mail.getReceiver().getName());
//            System.out.println("接收人邮箱 : " + mail.getReceiver().getEmail());
//            System.out.println("-----------------我是一条分界线----------------------");
        }

    }

    @Override
    public void run() {
        Long start = System.currentTimeMillis();
        this.sendMail();
        System.out.println("我是线程 " + Thread.currentThread().getName()+",共计耗时 : = > " + (System.currentTimeMillis() - start));
    }
}
