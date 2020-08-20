package br.com.codevelopment.client.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.codevelopment.client.service.contract.ClientService;
import br.com.codevelopment.common.dto.ProductDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/client")
@RequiredArgsConstructor
public class ClientController {

	private final ClientService service;
	
	@PostMapping("/order")
	@ResponseStatus(value = HttpStatus.OK)
	public void order(@RequestBody ProductDTO dto) {
		service.buy(dto);
	}
}
