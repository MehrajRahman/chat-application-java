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
  private Date date;

  public Message() {
  }

  public Message(String mess) {
    this.content = mess;
    this.date = new Date();
  }
  
  public String getMess(){
      return this.content;
  }
  
  public void setMess(String mess){
      this.content = mess;
  }





}
