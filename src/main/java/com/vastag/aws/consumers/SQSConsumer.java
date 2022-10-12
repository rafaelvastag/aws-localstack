package com.vastag.aws.consumers;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vastag.aws.Root;

@Component
public class SQSConsumer {

	@SqsListener(value = "${cloud.aws.queue.name}", deletionPolicy = SqsMessageDeletionPolicy.NEVER)
	public void receiveMessage(String message) throws JsonMappingException, JsonProcessingException {
		String removedLineBreak = message.replaceAll("\\n", "");
		System.out.println(removedLineBreak);
		String removedLineBreak2 = removedLineBreak.replaceAll("\\r\\n", "");
		System.out.println(removedLineBreak2);
		ObjectMapper objectMapper = new ObjectMapper();
		var x = objectMapper.readValue(removedLineBreak2, Root.class);
		System.out.println(message);
	}
}