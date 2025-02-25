package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
 private	int storageCapacity;
 private String operatingSystem;
 
 SmartPhone() {	
		
	}
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int
			 storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	

	
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("Operating System: "+ this.operatingSystem);
		System.out.println("Storage Capacity: "+this.storageCapacity+" GB");

	}
	
}
