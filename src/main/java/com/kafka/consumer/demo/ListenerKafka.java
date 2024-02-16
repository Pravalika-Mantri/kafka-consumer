package com.kafka.consumer.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ListenerKafka {
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive1(String s) {
		System.out.println("Received message by Consumer 1  "+s);
	}
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive2(String s) {
		System.out.println("Received message by Consumer 2 "+s);
	}
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive3(String s) {
		System.out.println("Received message by Consumer 3 "+s);
	}
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive4(String s) {
		System.out.println("Received message by Consumer 4 "+s);
	}
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive5(String s) {
		System.out.println("Received message by Consumer 5 "+s);
	}
	
	@KafkaListener(topics = "Topic7", groupId = "spring-boot-consumers")
	public void receive6(String s) {
		System.out.println("Received message by Consumer 6 "+s);
	}
	
	@KafkaListener(topics = "Customer-Topic10", groupId = "spring-boot-customer", 
			topicPartitions = {@TopicPartition(topic = "Customer-Topic11", partitions = {"3"})})
	public void receiveCusotemr(Object s) {
		System.out.println("Received cusotmer obj "+s.toString());
	}

}
