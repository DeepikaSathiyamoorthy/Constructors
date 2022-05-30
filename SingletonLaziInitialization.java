package com.vstl.javaConstructors;

public class SingletonLaziInitialization {
	
	private static SingletonLaziInitialization objSingleton;
	
	private SingletonLaziInitialization() {}
	
	public static SingletonLaziInitialization getSingletonInstance() {

		if (objSingleton == null) {
			synchronized (SingletonLaziInitialization.class) {
				if (objSingleton == null) {
					objSingleton = new SingletonLaziInitialization();
				}
			}
		}
			
		return objSingleton;
		
	}


public void message() {
	
	System.out.println("Singleton desing pattern");
	}

public void loginpin() {
	
	int intpinnumber = 1000;
	
	while(intpinnumber <= 1005) {
		
		System.out.println("Pin Number" + intpinnumber );
		intpinnumber++;
	}
}
}

