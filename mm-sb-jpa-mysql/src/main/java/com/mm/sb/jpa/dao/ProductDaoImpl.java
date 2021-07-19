/**
 * 
 */
package com.mm.sb.jpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.jpa.entity.Product;

/**
 * @author USER
 *
 */
@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> loadAllProductsFromDb() {
		return productRepository.findAll();
	}

	@Override
	public Product loadProductDetailsById(Long productId) {
		Optional<Product> result = productRepository.findById(productId);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}
	}

}