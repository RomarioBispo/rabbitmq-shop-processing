package br.com.codevelopment.shop.service.contract;

import br.com.codevelopment.common.dto.ProductDTO;

public interface ProductService {
	public void buy(ProductDTO product);
	public void processOrder(ProductDTO product);
}
