/**
 * 
 */
package com.mm.scm.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mm.scm.dao.VendorsRepository;

/**
 * @author USER
 *
 */
public class VenodorsBo {

	@Autowired
	private VendorsRepository vendorsRepository;
	
	public List<String> findAll() {
		return vendorsRepository.findAll();
	}

	public String findVendorByStartsWithChars(String startingChars) {
		//business validations and logic
		return vendorsRepository.findVendorByStartsWithChars(startingChars);
	}

	public String save(String vendor) {
		return vendorsRepository.save(vendor);
	}

	public String modifyVendor(String vendorToModify, String currentVendor) {
		return vendorsRepository.modifyVendor(vendorToModify, currentVendor);
	}

	public String removeVenodor(String vendorToDelete) {
		return vendorsRepository.removeVenodor(vendorToDelete);
	}

}
