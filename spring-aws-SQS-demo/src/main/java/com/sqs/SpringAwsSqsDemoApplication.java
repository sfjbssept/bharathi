package com.sqs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {
		org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration.class,
		org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration.class,
		org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration.class })
@RestController
public class SpringAwsSqsDemoApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringAwsSqsDemoApplication.class);

	@Autowired
	private QueueMessagingTemplate queueMessagingTemplate;

	@Value("${cloud.aws.end-point.uri}")
	private String sqsQueueEndPoint;

	@GetMapping("/send/{message}")
	public void sendMessageToSQSQueue(@PathVariable String message) {
		queueMessagingTemplate.send(sqsQueueEndPoint, MessageBuilder.withPayload(message).build());
	}
	
	@SqsListener("sqs-queue-demo-bharathi")
	public void fetchMessageFromSQSQueue(String message) {
		LOGGER.info("message from the SQS Queue {}", message);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsDemoApplication.class, args);
	}

}
