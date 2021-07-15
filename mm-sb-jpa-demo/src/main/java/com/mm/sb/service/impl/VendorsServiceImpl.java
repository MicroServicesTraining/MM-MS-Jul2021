/**
 * 
 */
package com.mm.sb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sb.api.response.VendorResponse;
import com.mm.sb.dao.VendorsDao;
import com.mm.sb.entity.Vendor;
import com.mm.sb.exception.VMSException;
import com.mm.sb.service.VendorsService;

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
		if (vendorsList != null && vendorsList.size() > 0) {
			vendorResponse.setVendors(vendorsList);
		} else {
			vendorResponse.setMessage("No Vendors Available");
		}
		return vendorResponse;
	}

	@Override
	public VendorResponse createVendor(Vendor vendor) {
		VendorResponse vendorResponse = new VendorResponse();
		Vendor newVendor = vendorsDao.createVendor(vendor);
		if (newVendor != null) {
			vendorResponse.setMessage("Creating Vendor Successful");
		} else {
			vendorResponse.setMessage("Creating Vendor failed");
		}
		return vendorResponse;
	}

	@Override
	public VendorResponse modifyVendor(Vendor vendor, Long vendorId) {
		VendorResponse vendorResponse = new VendorResponse();
		Vendor newVendor;
		try {
			newVendor = vendorsDao.modifyVendor(vendor, vendorId);
			if (newVendor != null) {
				vendorResponse.setMessage("Modifying Vendor Successful");
			} else {
				vendorResponse.setMessage("Modifying Vendor failed");
			}
		} catch (VMSException e) {
			vendorResponse.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return vendorResponse;
	}

	@Override
	public VendorResponse removeVendor(Long vendorId) {
		VendorResponse vendorResponse = new VendorResponse();
		Vendor newVendor;
		try {
			newVendor = vendorsDao.removeVendor(vendorId);
			if (newVendor != null) {
				vendorResponse.setMessage("Removing Vendor Successful");
			} else {
				throw new VMSException("Removing Vendor failed");
			}
		} catch (VMSException e) {
			vendorResponse.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return vendorResponse;
	}

}
