/**
 * 
 */
package com.mm.vms.api.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mm.vms.enitity.Vendor;

/**
 * @author USER
 *
 */
@JsonInclude(value = Include.NON_EMPTY)
public class VendorResponse {
	
	private String message;
	
	private List<Vendor> vendors;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the vendors
	 */
	public List<Vendor> getVendors() {
		return vendors;
	}

	/**
	 * @param vendors the vendors to set
	 */
	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}
	
}
