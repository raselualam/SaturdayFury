package com.upskill.java_5;

public abstract class AbstractClass {
	

	public abstract void iCar();
	
	public abstract void iReviewClass();
	
	public void car(){
		System.out.println("My car is a Tesla!");
	}
	
	public boolean ev(){
		boolean ev = true;
		return ev;
	}
	
	public abstract void iWheel(); 
	
	public abstract void iDoor(); 
	
	public abstract void iEngine(); 
	
	public abstract String iName();
	
	public abstract int iAge();
	
	public abstract boolean iEV();

	public int age(){
		int age = 28;
		return age;
	}
	
	public String name(){
		String name = "UpSkill";
		return name;
	}
	
	public void bus(){
		System.out.println("My bus is a Volvo!");
	}
}