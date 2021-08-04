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
public class DemoController {
	
	@GetMapping("/home")
	public String showHomePage() {
		return "<h1>Welcome to Demo APP</h1>";
	}

	@GetMapping("/adminhome")
	public String showAdminHomePage() {
		return "<h1> Welcome Admin...</h1>";
	}
	
	@GetMapping("/userhome")
	public String showUserHomePage() {
		return "<h1> Welcome User...</h1>";
	}
	
}
