package com.arun.vendor.service;

import java.util.List;

import com.arun.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	List<Vendor> displayAllVendors();
	Vendor getVendorById(int id);

}
