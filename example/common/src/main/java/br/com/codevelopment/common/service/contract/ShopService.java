package br.com.codevelopment.common.service.contract;

import java.util.List;

import br.com.codevelopment.common.dto.ProductDTO;

public interface ShopService {
	public void processOrder(ProductDTO product);
	public List<ProductDTO> listOrders();
}
