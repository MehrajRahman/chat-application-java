/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.messagingstompwebsocket;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Message {

    private int id;
    private String content;
    private String sentUserId;

    private String convId;
  private Date date;

  public Message() {
  }

  public Message(String mess) {
    this.content = mess;
    this.date = new Date();
  }

    public Message(String mess,String s, String c) {
        this.content = mess;
        this.sentUserId = s;
        this.convId = c;
        this.date = new Date();
    }
  
  public String getMess(){
      return this.content;
  }
  
  public void setMess(String mess){
      this.content = mess;
  }


    public void setSentUserId(String sentUserId) {
        this.sentUserId = sentUserId;
    }
    public String getSentUserId() {
       return this.sentUserId;
    }

    public String getConvId() {
        return convId;
    }

    public void setConvId(String convId) {
        this.convId = convId;
    }
}
