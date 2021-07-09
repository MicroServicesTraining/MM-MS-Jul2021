/**
 * 
 */
package com.mm.vms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.vms.dao.VendorsDao;
import com.mm.vms.enitity.Vendor;
import com.mm.vms.repository.VendorsRepository;


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

}
