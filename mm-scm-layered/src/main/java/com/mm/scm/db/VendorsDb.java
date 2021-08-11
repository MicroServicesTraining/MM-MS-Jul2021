/**
 * 
 */
package com.mm.scm.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author USER
 *
 */
@Component
public class VendorsDb {

	private List<String> vendorsList;

	/**
	 * @param vendorsList
	 */
	public VendorsDb() {
	//	this.vendorsList = Arrays.asList("Hewlet Packard", "Google", "Amazon", "Microsoft", "Apple");
		this.vendorsList = new ArrayList<String>();
		this.vendorsList.add("Hewlet Packard");
		this.vendorsList.add("Google");
		this.vendorsList.add("Amazon");
		this.vendorsList.add("Microsoft");
		this.vendorsList.add("Apple");
	}
	
	public List<String> select(){
		return vendorsList;
	}
	
	public String selectByStartsWithChars(String startingChars) {
		for(String vendor : vendorsList) {
			if(vendor.startsWith(startingChars)) {
				return vendor;
			}
		}
		return "No matching vendor"; 
	}
	
	public String insert(String vendor) {
		vendorsList.add(vendor);
		return vendor;
	}
	
	public String update(String modifyVendor, String currentVendor) {
		Iterator<String> it = vendorsList.iterator();
		String vendor = null;
		while(it.hasNext()) {
			vendor = it.next();
			if(vendor.equals(currentVendor)) {
				it.remove();
				vendorsList.add(modifyVendor);
				return "Vendor updated successfully";
			}
		}
		return "No matching vendor"; 
	}
	
	public String delete(String vendorToDelete) {
		Iterator<String> it = vendorsList.iterator();
		String vendor = null;
		while(it.hasNext()) {
			vendor = it.next();
			if(vendor.equals(vendorToDelete)) {
				it.remove();
				return "Vendor deleted successfully";
			}
		}
		return "No matching vendor"; 
	}
	
}
