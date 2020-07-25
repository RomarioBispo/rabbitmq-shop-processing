package br.com.codevelopment.shop.service.impl;

import org.springframework.stereotype.Service;

import br.com.codevelopment.common.dto.ProductDTO;
import br.com.codevelopment.common.entity.Product;
import br.com.codevelopment.common.repository.ProductRepository;
import br.com.codevelopment.shop.queue.sender.ShopSender;
import br.com.codevelopment.shop.service.contract.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private ShopSender sender;
	private ProductRepository repository;

	public ProductServiceImpl(ShopSender sender, ProductRepository repository) {
		super();
		this.sender = sender;
		this.repository = repository;
	}

	@Override
	public void buy(ProductDTO productDTO) {
		int i = 0;
		while (i < productDTO.getQuantity()) {
			sender.send(productDTO);
			i++;
		}

	}

	@Override
	public void processOrder(ProductDTO productDTO) {
		Product product = new Product();
		product.setBrand(productDTO.getBrand());
		product.setName(productDTO.getName());
		product.setPrice(productDTO.getPrice());
		repository.save(product);
	}

}
