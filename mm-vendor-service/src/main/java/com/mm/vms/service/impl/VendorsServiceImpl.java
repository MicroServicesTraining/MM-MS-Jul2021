/**
 * 
 */
package com.mm.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.vms.api.response.VendorResponse;
import com.mm.vms.dao.VendorsDao;
import com.mm.vms.enitity.Vendor;
import com.mm.vms.service.VendorsService;

/**
 * @author USER
 *
 */
@Service
public class VendorsServiceImpl implements VendorsService {

	@Autowired
	private VendorsDao vendorsDao;

	@Override
	public VendorResponse findAllVendors() {
		VendorResponse vendorResponse = new VendorResponse();
		List<Vendor> vendorsList = vendorsDao.findAllVendors();		
		if(vendorsList != null && vendorsList.size() > 0) {
			vendorResponse.setVendors(vendorsList);
		}else {
			vendorResponse.setMessage("No Vendors Available");
		}
		return vendorResponse;
	}

}
