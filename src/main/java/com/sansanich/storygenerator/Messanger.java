package com.sansanich.storygenerator;

import java.util.ArrayDeque;
import java.util.List;

public class Messanger {
    ArrayDeque<Message> messages;

    public void addMessage(Message message){
        messages.add(message);

    }

    public Message getMessage(){
        return messages.peek();
    }

}
