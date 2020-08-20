package br.com.codevelopment.client.service.impl;

import org.springframework.stereotype.Service;

import br.com.codevelopment.client.queue.sender.ShopSender;
import br.com.codevelopment.client.service.contract.ClientService;
import br.com.codevelopment.common.dto.ProductDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
	private final ShopSender sender;

	@Override
	public void buy(ProductDTO productDTO) {
		int i = 0;
		while (i < productDTO.getQuantity()) {
			sender.send(productDTO);
			i++;
		}

	}
}
