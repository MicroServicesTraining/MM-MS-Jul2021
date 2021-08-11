/**
 * 
 */
package com.mm.scm.service;

import java.util.List;

/**
 * @author USER
 *
 */
public interface VendrosService {

	List<String> findAll();

	String findVendorByStartsWithChars(String startingChars);

	String save(String vendor);

	String modifyVendor(String vendorToModify, String currentVendor);

	String removeVenodor(String vendorToDelete);

}
