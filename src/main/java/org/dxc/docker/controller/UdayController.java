package org.dxc.docker.controller;

import org.dxc.docker.model.Uday;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UdayController {
	
	@RequestMapping("/display")
	public Uday displayUday() {
		
		Uday u=new Uday("udaysai","703603450");
		return u;
		
	}

}
