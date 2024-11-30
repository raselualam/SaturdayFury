package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car(true);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	//void Method
		public void annualIncomeVoid(){
			int calculateAnnualIncome = hourlyIncome * 2000;
			int rentalIncome = 30000;
			int bonus = 20000;
			int sideHussel = 25000;
			int newIncome = calculateAnnualIncome + rentalIncome + bonus + sideHussel;
			System.out.println("My Annual Income = " + newIncome);
		}
	
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Tesla ");
	}
	
	public static void car(int seat){
		System.out.println("My car is Tesla, " + "it has seat : " + seat);
	}
	
	public static void car(String color){
		System.out.println("My car is Tesla, " + "it has color : " + color);
	}
	
	public static void car(boolean ev){
		System.out.println("My car is Tesla, " + "it is EV : " + ev);
	}
	
	public static void car(String motor, int wheel){
		System.out.println("My car is Tesla, " + "it has motor : " + motor + ", it has wheel : " + wheel);
	}
}