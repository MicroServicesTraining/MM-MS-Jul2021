/**
 * 
 */
package com.mm.vms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.vms.enitity.Vendor;
import com.mm.vms.service.VendorsService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/vendors")
public class VendorsApi {

	@Autowired
	private VendorsService vendorsService;

	@GetMapping
	public String getIndexPage() {
		return "<h1>Vendor Management Service</h1>";
	}

	@GetMapping("/all")
	public List<Vendor> findAllVendors() {
		return vendorsService.findAllVendors();
	}

}
