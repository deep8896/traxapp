package com.marketingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.services.LeadService;
@RestController
@RequestMapping("/api/leads")
public class RestLeadController<Lead> {
	@Autowired
	private LeadService leadservice;
	@GetMapping
	public java.util.List<com.marketingapp.entities.Lead> getAllLeads() {
		java.util.List<com.marketingapp.entities.Lead> lead = leadservice.leadLists();
		return lead;
	}
@PostMapping("/")
public void saveOneLead(@RequestBody com.marketingapp.entities.Lead lead) {
	leadservice.saveOneLead(lead);
}
@PutMapping
public void updateOneLead(@RequestBody com.marketingapp.entities.Lead lead) {
	leadservice.saveOneLead(lead);
}
@DeleteMapping("/delete/{id}")
public void deleteOneLead(@PathVariable("id")long id) {
	leadservice.deletebyId(id);
}
// Developing end points

@GetMapping("/lead_info/{id}")
public com.marketingapp.entities.Lead getOneLead(@PathVariable("id") long id) {
	com.marketingapp.entities.Lead oneLead = leadservice.getOneLead(id);
	return oneLead;
}




}
