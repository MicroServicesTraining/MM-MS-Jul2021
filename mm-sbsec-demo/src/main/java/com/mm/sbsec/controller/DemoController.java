/**
 * 
 */
package com.mm.sbsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/sbsec")
public class DemoController {
	
	@GetMapping
	public String sayHello() {
		return "<h1>HelloWorld, How are you...!</h1>";
	}

}
