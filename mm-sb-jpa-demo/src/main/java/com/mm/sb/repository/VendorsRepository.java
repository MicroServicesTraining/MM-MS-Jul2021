/**
 * 
 */
package com.mm.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sb.entity.Vendor;

/**
 * @author USER
 *
 */
@Repository
public interface VendorsRepository extends JpaRepository<Vendor, Long> {
	
}
