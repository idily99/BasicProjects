 package com.bus.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/find")
public class GetPasingerdetailes 
{
	@Autowired  
	PasingersDetailes  details;
	@GetMapping("/source")    
	 List<Bus> getDetailes(@RequestParam String source)
	{
		System.out.println("get pasingers detailes");
		 
		
		
		return details.findBySource(source);
		
	} 
 
}
