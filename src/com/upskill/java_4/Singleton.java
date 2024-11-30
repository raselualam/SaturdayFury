package com.upskill.java_4;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	protected void demo(){
		System.out.println("Demo method for singletone class");
	}
	
	protected void fury(){
		System.out.println("Demo method for singletone fury class");
	}
	
	protected void loki(){
		System.out.println("Demo method for singletone loki class");
	}
	
	public static Singleton getInstance(){
		return SingletonObj;
	}

}
