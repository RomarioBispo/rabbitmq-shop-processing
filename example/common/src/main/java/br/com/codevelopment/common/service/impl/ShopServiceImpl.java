package br.com.codevelopment.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.codevelopment.common.dto.ProductDTO;
import br.com.codevelopment.common.entity.Product;
import br.com.codevelopment.common.repository.ProductRepository;
import br.com.codevelopment.common.service.contract.ShopService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
	private final ProductRepository repository;

	@Override
	public void processOrder(ProductDTO productDTO) {
		Product product = new Product();
		product.setBrand(productDTO.getBrand());
		product.setName(productDTO.getName());
		product.setPrice(productDTO.getPrice());
		repository.save(product);
	}

	@Override
	public List<ProductDTO> listOrders() {
		List<ProductDTO> productListDTO = new ArrayList<>();
		ProductDTO dto;
		for (Product item: repository.findAll()) {
			dto = new ProductDTO();
			dto.setBrand(item.getBrand());
			dto.setName(item.getName());
			dto.setPrice(item.getPrice());
			dto.setId(item.getId());
			productListDTO.add(dto);
		}
		return productListDTO;
	}

}
