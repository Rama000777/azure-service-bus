package com.local.azure.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.local.azure.entity.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class QueueReceiveListener {

	private static final String QUEUE_NAME = "testingqueue";

	/**
	 * This method will read the messages from the queue
	 * 
	 * @param user
	 */
	@JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
	public void receiveMessage(User user) {
		log.info("Received message: {}", user.getName());
	}
}