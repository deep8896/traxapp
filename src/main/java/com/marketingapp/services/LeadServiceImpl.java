package com.marketingapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repositories.LeadRepository;

@Service
public  class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;


	@Override
	public void saveOneLead(Lead lead) {
     leadRepo.save(lead);
		
	}
	@Override
	public java.util.List<Lead> leadLists() {
		java.util.List<Lead> leads = leadRepo.findAll();
		return leads;
	
		
	}
	@Override
	public void deletebyId(long id) {
		 leadRepo.deleteById(id);
		
		
		
	}
	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	

	


}
