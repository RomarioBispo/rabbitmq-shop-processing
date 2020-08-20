package br.com.codevelopment.shop.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.codevelopment.common.dto.ProductDTO;
import br.com.codevelopment.common.service.contract.ShopService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/shop")
@RequiredArgsConstructor
public class ShopController {
	
	private final ShopService service;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<ProductDTO> listAll() {
		return service.listOrders();
	}
	
}
