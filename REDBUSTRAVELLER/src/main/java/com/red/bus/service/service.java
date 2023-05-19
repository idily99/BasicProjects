package com.red.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.red.bus.Bus;
import com.red.bus.dto.BusDto;
import com.red.bus.repo.BusRepo;
@Service
public class service implements BusService
{
	@Autowired
	BusRepo repos;

	public BusDto enterDetailes(BusDto busdto) 
	{
		Bus dtos=BusDtoToEntity(busdto);
		Bus savebus=repos.save(dtos);
		
		return EntityToBus(savebus);
	}
	public Bus BusDtoToEntity(BusDto dt)
	{
		Bus buss=new Bus();
		buss.setTicket_no(dt.getTicket_no());
		buss.setSource(dt.getSource());
		buss.setDistnation(dt.getDistnation());
		return buss;
	}
	public BusDto EntityToBus(Bus savebus)
	{
		BusDto bto=new BusDto();
		bto.setTicket_no(savebus.getTicket_no());
		bto.setSource(savebus.getSource());
		bto.setDistnation(savebus.getDistnation());
		return bto;
		
	}
}
