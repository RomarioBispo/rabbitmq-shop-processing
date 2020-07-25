package br.com.codevelopment.shop.queue.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.codevelopment.common.dto.ProductDTO;
import br.com.codevelopment.shop.service.contract.ProductService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ShopReceiver {
	
    public ShopReceiver(ProductService service) {
		super();
		this.service = service;
	}

	private	ProductService service;
	
	@RabbitListener(queues = {"${queue.processing.name}"})
    public void receive(@Payload ProductDTO productDTO) {
       log.debug("order received: " + productDTO);
       service.processOrder(productDTO);
    }
}
