package com.zhang.design.patterns.creator.prototype.example1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Client {



    public static void main1( String[] args) {

        Sender sender = Sender.builder()
                .email("111@qq.com")
                .name("张三")
                .build();


        List<Receiver> receiverList = new ArrayList<>();
        Receiver receiver = null;
        for (int i = 0; i < 6; i++) {
            receiver = Receiver.builder()
                    .email(Math.random() + "222@qq.com")
                    .name(String.valueOf(Math.random()*10).substring(5) + "名字")
                    .build();
            receiverList.add(receiver);
        }
        
        Mail mail = new Mail();

        for (int i = 0; i <6 ; i++) {
            mail.setSender(sender);
            mail.setReceiver(receiverList.get(i));
            mail.setContext("春节大酬宾!!!!全场八折....");
            mail.setSubject("推送通知");
            sendMail(mail);
        }



    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            getRandString();
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("发送人 : " + mail.getSender().getName());
        System.out.println("发送人邮箱 : " + mail.getSender().getEmail());
        System.out.println("标题 : " + mail.getSubject());
        System.out.println("内容 : " + mail.getContext());
        System.out.println("接收人 : " + mail.getReceiver().getName());
        System.out.println("接收人邮箱 : " + mail.getReceiver().getEmail());
    }

    public static String getRandString(){
        Double rand = Math.random();
        String temp = rand.toString().substring(2,8);
        char[] charArr = temp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            int c = Integer.parseInt(String.valueOf(charArr[i]));
            char charTo = (char)97;
            System.out.println(charTo);
            sb.append(charTo);
        }
//        System.out.println(sb.toString());
        return sb.toString();
    }

}
