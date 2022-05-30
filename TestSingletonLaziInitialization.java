package com.vstl.javaConstructors;

public class TestSingletonLaziInitialization {

	public static void main(String[] args) {
		
		SingletonLaziInitialization objSingleton = SingletonLaziInitialization.getSingletonInstance(); 
		objSingleton.message();
		
		objSingleton.loginpin();
	}

}
