package com.vastag.aws.consumers;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SQSConsumer {

	@SqsListener("${cloud.aws.queue.name}")
	public void receiveMessage(String message) {
		System.out.println(message);
	}
}