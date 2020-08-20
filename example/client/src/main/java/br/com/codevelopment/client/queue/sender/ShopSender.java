package br.com.codevelopment.client.queue.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.codevelopment.common.dto.ProductDTO;

@Component
public class ShopSender {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
 
    @Autowired
    private Queue queue;
 
    public void send(ProductDTO order) {
        rabbitTemplate.convertAndSend(queue.getName(), order);
    }
}
