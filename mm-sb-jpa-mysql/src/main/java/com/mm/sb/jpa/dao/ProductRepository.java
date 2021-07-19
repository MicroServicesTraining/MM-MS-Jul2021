/**
 * 
 */
package com.mm.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sb.jpa.entity.Product;

/**
 * @author USER
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
