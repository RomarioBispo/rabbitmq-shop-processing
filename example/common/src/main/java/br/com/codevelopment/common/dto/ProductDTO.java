package br.com.codevelopment.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String brand;
	private Double price;
	private Integer quantity;
}
