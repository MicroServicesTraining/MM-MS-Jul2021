/**
 * 
 */
package com.mm.sb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.api.response.VendorResponse;
import com.mm.sb.service.VendorsService;

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
	public ResponseEntity<VendorResponse> findAllVendors() {
		VendorResponse vendorResponse =  vendorsService.findAllVendors();
		if(vendorResponse.getVendors() != null) {
			return ResponseEntity.ok(vendorResponse);
		}else {
			return ResponseEntity.ok(vendorResponse).status(HttpStatus.NOT_FOUND).build();
		}
	}

}
