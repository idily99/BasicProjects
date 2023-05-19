package com.touriest.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class getSource
{
	@Autowired
	BusStation station;
	@GetMapping(value="/")
	public String getInfo()
	{
		return "home.jsp";
	}
	        
	@PostMapping(value="/cli")
	public String getPlace(Busservice datas)
	{
          
		station.save(datas);
		System.out.println("data have sucessfully stored--------------------------stored");
		return "done.jsp";
	}   
}
   