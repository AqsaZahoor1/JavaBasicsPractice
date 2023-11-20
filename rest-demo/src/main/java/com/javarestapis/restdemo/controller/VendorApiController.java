package com.javarestapis.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javarestapis.restdemo.model.Vendor;
import com.javarestapis.restdemo.services.VendorService;

@RestController
@RequestMapping("/vendor")

public class VendorApiController {

	Vendor vendor;
	@Autowired
	VendorService vendorService;

	@GetMapping("/all")
	public List<Vendor> getAllVendors() {

		return vendorService.getAllVendors();

	}

	@GetMapping("{vendorId}")
	public Vendor getVendorDetails(@PathVariable String vendorId) {
		System.out.println("ID "+vendorId);

		return vendorService.getVendorById(vendorId);
	}

	@PostMapping
	public String createVendor(Vendor vendor) {

		this.vendor = vendor;
		return "Vendor create successfully";
	}

	@PutMapping
	public String updateVendor(Vendor vendor) {

		this.vendor = vendor;
		return "Vendor updated successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteVendor(String vendorId) {

		this.vendor = null;
		return "Vendor deleted successfully";
	}
}
