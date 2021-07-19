/**
 * 
 */
package com.mm.sb.jpa.service;

import org.springframework.http.ResponseEntity;

import com.mm.sb.jpa.response.ProductsResponse;

/**
 * @author USER
 *
 */
public interface ProductService {

	ResponseEntity<ProductsResponse> loadAllProductsFromDb();

	ResponseEntity<ProductsResponse> loadProductDetailsById(Long productId);
	
}
