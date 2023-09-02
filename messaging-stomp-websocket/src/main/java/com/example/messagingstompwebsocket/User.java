package com.example.messagingstompwebsocket;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String password;

    private ArrayList<Conversation> conversationArrayList;
    private int numberOfConversation = 0;

    public User(){
    }

    public User(String u, String p){
        this.username = u;
        this.password = p;

    }

    public void addConversation(Conversation c){
        this.conversationArrayList.add(c);
        this.numberOfConversation++;
    }

}
