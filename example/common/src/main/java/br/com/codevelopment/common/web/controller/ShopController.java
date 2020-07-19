package br.com.codevelopment.common.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shop")
public class ShopController {
	
	@PostMapping("/{qtd}")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void buy(@RequestBody String product, @PathVariable int qtd) {
		
	}
	
}
