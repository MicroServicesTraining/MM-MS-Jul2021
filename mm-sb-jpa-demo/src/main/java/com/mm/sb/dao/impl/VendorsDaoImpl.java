/**
 * 
 */
package com.mm.sb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.dao.VendorsDao;
import com.mm.sb.entity.Vendor;
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

}
