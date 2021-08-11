/**
 * 
 */
package com.mm.vms.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mm.vms.enitity.Vendor;

/**
 * @author USER
 *
 */
@Component
public class VendorsDb {

	private List<Vendor> vendors;
	
	public VendorsDb() {
		vendors = new ArrayList<Vendor>();
		/*
		 * Vendor vendor1 = new Vendor(); vendor1.setId(1001L); vendor1.setName("HCL");
		 * vendor1.setCategory("Computers"); vendor1.setGrade(1);
		 * vendor1.setRating(3.75); vendors.add(vendor1); Vendor vendor2 = new Vendor();
		 * vendor2.setId(1002L); vendor2.setName("Microsoft");
		 * vendor2.setCategory("Software"); vendor2.setGrade(1); vendor2.setRating(4.5);
		 * vendors.add(vendor2);
		 */
		
	}
	
	
	public List<Vendor> select() {
		return this.vendors;
	}

}
