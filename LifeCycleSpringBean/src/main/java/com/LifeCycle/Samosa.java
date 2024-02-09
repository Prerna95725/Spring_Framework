//Implementation Lifecycle methods using XML
package com.LifeCycle;


public class Samosa {
     private String price;

	public void setPrice(String price) {
		System.out.println("setting price");
		this.price = price;
	}

	

	public void giveprice(){
		System.out.println("price of samosa:"+price);
	}
	
	public void init(){
		System.out.println("init working");
	}
	
	public void destroy(){
		System.out.println("destroy die");
	}
     
}
