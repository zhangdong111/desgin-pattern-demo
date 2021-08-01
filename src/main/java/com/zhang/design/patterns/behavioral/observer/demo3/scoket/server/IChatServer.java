package com.zhang.design.patterns.behavioral.observer.demo3.scoket.server;

import com.zhang.design.patterns.behavioral.observer.demo3.entity.Message;
import com.zhang.design.patterns.behavioral.observer.demo3.entity.User;

/**
 * @author Rexxar
 * @date 2021/8/1
 */
public interface IChatServer {


    void sendMessage(User user , Message message);


}
