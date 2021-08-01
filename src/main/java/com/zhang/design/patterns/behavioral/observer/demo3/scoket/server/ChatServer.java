package com.zhang.design.patterns.behavioral.observer.demo3.scoket.server;

import com.zhang.design.patterns.behavioral.observer.demo3.entity.Message;
import com.zhang.design.patterns.behavioral.observer.demo3.entity.User;

import java.net.Socket;
import java.util.List;
import java.util.Observable;

/**
 * @author Rexxar
 * @date 2021/8/1
 */
public class ChatServer extends Observable implements IChatServer {


    @Override
    public void sendMessage(User sendUser, List<User> reciverUser, Message message) {

    }
}
