///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.example.messagingstompwebsocket;
//
///**
// *
// * @author Student
// */
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.util.HtmlUtils;
//
//import java.text.DateFormat;
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@RestController
//
//public class GreetingController {
//
//
////  @MessageMapping("/hello")
////  @SendTo("/topic/greetings")
////  public Greeting greeting(HelloMessage message) throws Exception {
////    Thread.sleep(500); // simulated delay
////    System.out.println("Hello @!!!!!");
////    return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) );
////  }
//
//  @MessageMapping("/message")
//  @SendTo("/topic/greetings2")
//
//  public Object greeting2(Message message) throws Exception {
//    Thread.sleep(500); // simulated delay
//      System.out.println("Hello @!!!!!");
//    Map<String, Object> object = new HashMap<>();
//
//    Date date = new Date();
//    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//    object.put("mess", message.getMess());
//    object.put("date", localDate);
//    return object;
////    return new Message(  HtmlUtils.htmlEscape(message.getMess()) );
////    Message a = message.getMess();
////    return a;
////    message.getMess();
//  }
//
//
////  @MessageMapping("/login")
////  @SendTo("/topic/login/")
////  public Object createUser(User user)
////  {
////    System.out.println(user.username);
////    if(user.username == "helo" && user.password == "123"){
////      Map<String, Object> object = new HashMap<>();
////
////      object.put("status", true);
////      object.put("username", user.username);
////      object.put("date", user.password);
////      return object;
////    }
////    Map<String, Object> object = new HashMap<>();
////
////    object.put("status", false);
////    object.put("username", "");
////    object.put("date", "");
////    return object;
////  }
////@Autowired @Qualifier("User")
////@RequestMapping(value = "/login", method = RequestMethod.POST)
//
////  public @ResponseBody
////
////
////  @RequestMapping(path = {"/loginUser"}, method = RequestMethod.POST)
////  Object newEmployee(@RequestBody User user) {
////    if(user.username.equals("helo" )&& user.password.equals("123") ){
////      Map<String, Object> object = new HashMap<>();
////
////      object.put("status", true);
////      object.put("username", user.username);
////      object.put("date", user.password);
////      return object;
////    }
////    Map<String, Object> object = new HashMap<>();
////
////    object.put("status", false);
////    object.put("username", "");
////    object.put("date", "");
////    return object;
////  }
//
//}