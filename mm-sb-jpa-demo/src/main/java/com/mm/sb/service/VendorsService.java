/**
 * 
 */
package com.mm.sb.service;

import com.mm.sb.api.response.VendorResponse;
import com.mm.sb.entity.Vendor;

/**
 * @author USER
 *
 */
public interface VendorsService {

	VendorResponse findAllVendors();

	VendorResponse createVendor(Vendor vendor);

	VendorResponse modifyVendor(Vendor vendor, Long vendorId);

	VendorResponse removeVendor(Long vendorId);

}
