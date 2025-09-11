package com.subhash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhash.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepo;
	public void readBonud(int empid) {
		empRepo.getBonus(empid);	
	}
}
