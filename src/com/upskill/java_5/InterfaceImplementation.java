package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iCar() {
		System.out.println("My car is a BMW !");
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 6 wheel !");
	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 Door !");
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 20hp !");
	}

	@Override
	public String iName() {
		String name = "Upskill";
		return name;
	}

	@Override
	public int iAge() {
		int age = 30;
		return age;
	}

	@Override
	public boolean iEV() {
		boolean ev = true;
		return ev;
	}

}
