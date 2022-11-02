package com.marketingapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;



@Controller
public class LeadController {
@Autowired
private EmailService emailService;

@Autowired
private LeadService leadservice;

@RequestMapping("/createlead")
 private String viewCreateLeadpage() {
	return "create_leadpage";
}
@RequestMapping("/saveLead")
private String saveOneLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
	leadservice.saveOneLead(lead); 
	emailService.sendingSimpleMessege(lead.getEmail(), "Welcome","We have receied inquery");
	model.addAttribute("msg","Lead is Created!");
	return "create_leadpage";
}
@RequestMapping("/listall")
 public String listAllLeads(ModelMap model) {
	java.util.List<Lead> leads =leadservice.leadLists();
	model.addAttribute("leads", leads);
	return "lead_list";
}

@RequestMapping("/delete")
public String deletebyId(@RequestParam("id")long id, ModelMap model ) {
	leadservice.deletebyId(id);
java.util.List<Lead> leads =leadservice.leadLists();
model.addAttribute("leads", leads);
return "lead_list";
}
@RequestMapping("/update")
  public String updateOneLead(@RequestParam("id")long id,ModelMap model) {
	Lead oneLead = leadservice.getOneLead(id);
	model.addAttribute("lead", oneLead);
	return "update_lead";
  }
@RequestMapping("/updateLead")
  public String updateLead(LeadData data, ModelMap model) {
	Lead lead = new Lead();
	lead.setId(data.getId());
	lead.setFirstName(data.getFirstName());
	lead.setLastName(data.getLastName());
	lead.setEmail(data.getEmail());
	lead.setMobile(data.getMobile());
	leadservice.saveOneLead(lead);
	java.util.List<Lead> leads =leadservice.leadLists();
	model.addAttribute("leads", leads);
	model.addAttribute("msg","Lead is Updated!");
	return "lead_list";
}
}