/**
 * 
 */
package com.mm.sb.dao;

import java.util.List;

import com.mm.sb.entity.Vendor;
import com.mm.sb.exception.VMSException;

/**
 * @author USER
 *
 */
public interface VendorsDao {

	List<Vendor> findAllVendors();

	Vendor createVendor(Vendor vendor);

	Vendor modifyVendor(Vendor vendor, Long vendorId) throws VMSException;

	Vendor removeVendor(Long vendorId) throws VMSException;

}
