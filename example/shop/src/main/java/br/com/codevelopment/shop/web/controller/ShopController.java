package br.com.codevelopment.shop.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.codevelopment.common.dto.ProductDTO;
import br.com.codevelopment.shop.service.contract.ProductService;

@RestController
@RequestMapping("/api/v1/shop")
public class ShopController {
	
	private ProductService service;
	
	public ShopController(ProductService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void buy(@RequestBody ProductDTO productDTO) {
		service.buy(productDTO);
	}
	
}
