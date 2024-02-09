package com.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class pepsi {
	private String price;

	public void setPrice(String price) {
		this.price = price;
	}
	
  public void pepsiprice(){
	  System.out.println("price"+price);
  }
  @PostConstruct
  public void start(){
	  System.out.println("starting method");
  }
  @PreDestroy
  public void end(){
	  System.out.println("end method");
  }
}
