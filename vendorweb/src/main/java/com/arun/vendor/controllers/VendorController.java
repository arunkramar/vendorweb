package com.arun.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arun.vendor.entities.Vendor;
import com.arun.vendor.service.VendorService;

@Controller
public class VendorController {

	@Autowired
	VendorService service;

	@RequestMapping("/showCreateVendor")
	public String showCreateVendor() {

		return "createVendor";
	}

	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		service.saveVendor(vendor);
		String msg="Save successful for id: "+vendor.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}

	@RequestMapping("/displayAllVendors")
	public String displayAllVendors(ModelMap modelMap) {
		List<Vendor> vendors = service.displayAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}

	@RequestMapping("/deleteVendor")
	public String deleteVendor(int id, ModelMap modelMap) {

		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.displayAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/editVendor")
	public String editLocation(int id, ModelMap modelMap) {
	
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "editScreen";
	}
	
	@RequestMapping("/editSaveVendor")
	public String saveEditVedor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor saveVendor = service.saveVendor(vendor);
		modelMap.addAttribute("vendor", saveVendor);
		String msg = "Save successful";
		modelMap.addAttribute("msg", msg);
		return "editScreen";
	}

}
