package com.example.messagingstompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@SpringBootApplication
//@ComponentScan({"com.example.messagingstompwebsocket"})
//@EntityScan("com.example.messagingstompwebsocket")
//@EnableJpaRepositories("com.example.messagingstompwebsocket")
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}

}
