/**
 * 
 */
package com.mm.musec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/admin")
public class DemoController {

	@GetMapping
	public String showWelcomePage() {
		return "<h1> Welcome Admin...</h1>";
	}
	
}
