/**
 * 
 */
package com.mm.scm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.scm.dao.VendorsRepository;

/**
 * @author USER
 *
 */
@Service
public class VendorsServiceImpl implements VendrosService {

	@Autowired
	private VendorsRepository vendorsRepository;

	@Override
	public List<String> findAll() {
		return vendorsRepository.findAll();
	}

	@Override
	public String findVendorByStartsWithChars(String startingChars) {
		return vendorsRepository.findVendorByStartsWithChars(startingChars);
	}

	@Override
	public String save(String vendor) {
		return vendorsRepository.save(vendor);
	}

	@Override
	public String modifyVendor(String vendorToModify, String currentVendor) {
		return vendorsRepository.modifyVendor(vendorToModify, currentVendor);
	}

	@Override
	public String removeVenodor(String vendorToDelete) {
		return vendorsRepository.removeVenodor(vendorToDelete);
	}
	
}
