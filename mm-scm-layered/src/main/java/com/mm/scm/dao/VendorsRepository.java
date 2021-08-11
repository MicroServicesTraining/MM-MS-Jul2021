/**
 * 
 */
package com.mm.scm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mm.scm.db.VendorsDb;

/**
 * @author USER
 *
 */
@Repository
public class VendorsRepository {

	@Autowired
	private VendorsDb vendorDb;

	public List<String> findAll() {
		return vendorDb.select();
	}

	public String findVendorByStartsWithChars(String startingChars) {
		return vendorDb.selectByStartsWithChars(startingChars);
	}

	public String save(String vendor) {
		return vendorDb.insert(vendor);
	}

	public String modifyVendor(String vendorToModify, String currentVendor) {
		return vendorDb.update(vendorToModify, currentVendor);
	}

	public String removeVenodor(String vendorToDelete) {
		return vendorDb.delete(vendorToDelete);
	}

}
