/**
 * 
 */
package com.mm.scm.vendor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("vendors")
public class VendorsController {
	
	private List<String> vendorsList;

	/**
	 * @param vendorsList
	 */
	public VendorsController() {
	//	this.vendorsList = Arrays.asList("Hewlet Packard", "Google", "Amazon", "Microsoft", "Apple");
		this.vendorsList = new ArrayList<String>();
		this.vendorsList.add("Hewlet Packard");
		this.vendorsList.add("Google");
		this.vendorsList.add("Amazon");
		this.vendorsList.add("Microsoft");
		this.vendorsList.add("Apple");
	}

	@RequestMapping(path="/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<String> loadAllVendors() {
		return vendorsList;
	}
	
	//@RequestMapping(path="/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@PostMapping
	public String createVendor(@RequestParam String vendor) {
		vendorsList.add(vendor);
		return vendor;
	}
}
