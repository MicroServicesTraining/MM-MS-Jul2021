/**
 * 
 */
package com.mm.vms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.vms.db.VendorsDb;
import com.mm.vms.enitity.Vendor;

/**
 * @author USER
 *
 */
@Component
public class VendorsRepository {
	
	@Autowired
	private VendorsDb vendorsDb;

	public List<Vendor> findAll() {
		return vendorsDb.select();
	}

}
