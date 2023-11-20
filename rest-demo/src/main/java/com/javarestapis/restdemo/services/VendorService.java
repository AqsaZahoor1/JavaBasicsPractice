package com.javarestapis.restdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javarestapis.restdemo.model.Vendor;

@Service
public class VendorService {

	public VendorService() {
		// TODO Auto-generated constructor stub
	}

	public void serviceA() {
		System.out.println("Service A");
	}

	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return this.vendorDetails();
	}

	public List<Vendor> vendorDetails() {
		// TODO Auto-generated method stub

		List obj = new ArrayList<Vendor>();

		Vendor v1 = new Vendor();
		v1.setVendorId("v1");
		v1.setVendorName("Vendor 1");
		v1.setVendorPhone("xxxx");
		v1.setVendorAddress("Address 123");

		obj.add(v1);
		v1 = new Vendor();
		v1.setVendorId("v2");
		v1.setVendorName("Vendor 2");
		v1.setVendorPhone("xxxx");
		v1.setVendorAddress("Address 123");
		obj.add(v1);

		return obj;
	}

	public Vendor searchVendorById(List<Vendor> vendorsList, String Id) {
System.out.println("List Size : "+vendorsList.size());
		for (int i = 0; i < vendorsList.size(); i++) {

			if (vendorsList.get(i).getVendorId().equals(Id)) {
				return vendorsList.get(i);
			}
		}
		return null;

	}

	public Vendor getVendorById(String Id) {
		// TODO Auto-generated method stub
		
		return this.searchVendorById(this.vendorDetails(), Id);
		
		
	}

}
