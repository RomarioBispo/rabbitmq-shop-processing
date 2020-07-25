package br.com.codevelopment.common.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String brand;
	private Double price;
	private Integer quantity;
}
