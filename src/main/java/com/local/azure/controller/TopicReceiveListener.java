package com.local.azure.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.local.azure.entity.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TopicReceiveListener {

	private static final String TOPIC_NAME = "mytopic";

	private static final String SUBSCRIPTION_NAME = "topicnamesservice";

	/**
	 * This method will read the messages from the topic
	 * 
	 * @param user
	 */
	@JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory", subscription = SUBSCRIPTION_NAME)
	public void receiveMessage(User user) {
		log.info("Received message: {}", user.getName());
	}
}