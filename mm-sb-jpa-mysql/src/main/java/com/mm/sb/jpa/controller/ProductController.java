/**
 * 
 */
package com.mm.sb.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.jpa.response.ProductsResponse;
import com.mm.sb.jpa.service.ProductService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<ProductsResponse> loadAllProductsFromDb(){
		return productService.loadAllProductsFromDb();
	}
	
	@GetMapping("/{skuno}")
	public ResponseEntity<ProductsResponse> loadProductDetailsById(@PathVariable(name = "skuno") Long productId){
		return productService.loadProductDetailsById(productId);
	}

}
