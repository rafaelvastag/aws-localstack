package com.vastag.aws.consumers;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SQSConsumer {

	@SqsListener(value = "${cloud.aws.queue.name}",deletionPolicy = SqsMessageDeletionPolicy.NEVER)
	public void receiveMessage(String message) {
		System.out.println(message);
	}
}