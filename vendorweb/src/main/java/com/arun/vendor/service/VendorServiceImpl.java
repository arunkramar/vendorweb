package com.arun.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arun.vendor.entities.Vendor;
import com.arun.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRepository.delete(vendor);
	}

	@Override
	public List<Vendor> displayAllVendors() {
		return vendorRepository.findAll();
	}

	@Override
	public Vendor getVendorById(int id) {
		
		return vendorRepository.findById(id).get();
	}

}
