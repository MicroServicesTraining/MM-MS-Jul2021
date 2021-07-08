/**
 * 
 */
package com.mm.scm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.scm.service.VendrosService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/vendors")
public class VendorsApi {

	@Autowired
	private VendrosService vendorsService;
	
	@GetMapping
	public String loadVendorsIndexPage() {
		return "<h1>Vendors API</h1>";
	}
	
	@RequestMapping(path="/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<String> loadAllVendors() {
		return vendorsService.findAll();
	}
	
	//@RequestMapping(path="/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@PostMapping
	public String createVendor(@RequestParam String vendor) {
		return vendorsService.save(vendor);
	}
	
	@PutMapping
	public String modifyVendor(@RequestParam String vendorToModify, @RequestParam String currentVendor) {
		return vendorsService.modifyVendor(vendorToModify, currentVendor);
	}

	@DeleteMapping
	public String deleteVendor(@RequestParam String vendor) {
		return vendorsService.removeVenodor(vendor);
	}
	
}
