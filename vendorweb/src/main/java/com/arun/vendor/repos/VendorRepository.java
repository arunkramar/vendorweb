package com.arun.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
