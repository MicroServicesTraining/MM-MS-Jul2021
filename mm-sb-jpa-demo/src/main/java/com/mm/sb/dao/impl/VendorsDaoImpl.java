/**
 * 
 */
package com.mm.sb.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.dao.VendorsDao;
import com.mm.sb.entity.Vendor;
import com.mm.sb.exception.VMSException;
import com.mm.sb.repository.VendorsRepository;

/**
 * @author USER
 *
 */
@Component
public class VendorsDaoImpl implements VendorsDao{

	@Autowired
	private VendorsRepository vendorsRepository;

	@Override
	public List<Vendor> findAllVendors() {
		return vendorsRepository.findAll();
	}

	@Override
	public Vendor createVendor(Vendor vendor) {
		return vendorsRepository.save(vendor);
	}

	@Override
	public Vendor modifyVendor(Vendor vendor, Long vendorId) throws VMSException {
		Optional<Vendor> vendorInDb = vendorsRepository.findById(vendorId);
		if(vendorInDb.isPresent()) {
			vendorsRepository.save(vendor);
		}else {
			throw new VMSException("No Vendor found with given id");
		}
		return vendor;
	}

	@Override
	public Vendor removeVendor(Long vendorId) throws VMSException {
		Optional<Vendor> vendorInDb = vendorsRepository.findById(vendorId);
		if(vendorInDb.isPresent()) {
			vendorsRepository.delete(vendorInDb.get());
		}else {
			throw new VMSException("No Vendor found with given id");
		}
		return vendorInDb.get();		
	}

}
