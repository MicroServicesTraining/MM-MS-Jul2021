/**
 * 
 */
package com.mm.sb.jpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mm.sb.jpa.entity.Product;

/**
 * @author USER
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByName(String productName);
	
	Optional<List<Product>> findByCategory(String category);
	
	@Query(value = "select p from Product p where p.name like %:str%")
	Optional<List<Product>> getProductsByString(@Param(value = "str") String str);

}
