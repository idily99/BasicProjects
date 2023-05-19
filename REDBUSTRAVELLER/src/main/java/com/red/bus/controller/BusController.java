package com.red.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.red.bus.dto.BusDto;
import com.red.bus.service.BusService;

@RestController
@RequestMapping("/api/auth")
public class BusController
{
	@Autowired
	BusService services;
	@PostMapping("/save")
	public ResponseEntity<BusDto> saveData(@RequestBody BusDto busdetailes)
	{
         services.enterDetailes(busdetailes);
         System.out.println("sucess full stored data");
          return new ResponseEntity(services.enterDetailes(busdetailes), HttpStatus.CREATED); 
	}
}
