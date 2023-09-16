package com.example.messagingstompwebsocket;

import java.io.Serializable;
import java.util.ArrayList;

public class Conversation implements Serializable {
    private String id;



    private ArrayList<Message> messageArrayList;
    public Conversation(){

    }
    public Conversation(String i){
        this.id = i;
        this.messageArrayList = new ArrayList<>();

    }

    public void addMessage(Message m){
        this.messageArrayList.add(m);
    }
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id ;
    }


}
