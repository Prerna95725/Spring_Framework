package com.springcore.collection;

public class Person {
    private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
    
    
}
