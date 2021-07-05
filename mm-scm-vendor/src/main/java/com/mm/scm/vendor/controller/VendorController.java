/**
 * 
 */
package com.mm.scm.vendor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping(path = "/api/v1/vendors")
public class VendorController {

	@GetMapping(path = "/welcome")
	public String showWelcomeMessage() {
		return "<h1>Welcome To Vendors Page</h1>";
	}
	
}
