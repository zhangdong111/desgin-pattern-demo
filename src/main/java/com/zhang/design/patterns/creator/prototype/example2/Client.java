package com.zhang.design.patterns.creator.prototype.example2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Sender sender = new Sender("张三","159@qq.com");
        String context = "您的工资将在今日下午,发放共计xxx元";
        String subject ="发送工资通知...";
        List<Receiver> receiverList = new ArrayList<>();
        for (int i = 0; i < 200000; i++) {
            Receiver receiver = new Receiver();
            receiver.setEmail(String.valueOf(Math.random()).substring(2,10) + "@qq.com");
            receiver.setName(getRandString());
            receiverList.add(receiver);
        }
        ManageMail manage = new ManageMail(subject,context,sender,receiverList);
        Sender sender2 = new Sender("李四","159@qq.com");
        ManageMail manage2 = new ManageMail(subject,context,sender2,receiverList);
        Thread thread1 = new Thread(manage);
        Thread thread2 = new Thread(manage2);
        thread1.start();
        thread2.start();
    }

    public static String getRandString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            Double rand = Math.random();
            String temp = rand.toString().substring(2,3);
            char charTo = (char)(97+Integer.parseInt(temp));
            sb.append(charTo);
        }
        return sb.toString();
    }

}
