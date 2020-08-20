package br.com.codevelopment.client.queue.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SenderConfig {
	@Value("${queue.processing.name}")
	private String processingQueue;

	@Bean
	public Queue queue() {
		return new Queue(processingQueue, true);
	}

}
