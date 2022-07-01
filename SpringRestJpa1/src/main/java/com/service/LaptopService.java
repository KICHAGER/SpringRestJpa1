package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Laptop;
import com.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepository lrepo;
	
	public Laptop addLaptop(Laptop l)
	{
		lrepo.save(l);
		return l;
		
	}
	

}
