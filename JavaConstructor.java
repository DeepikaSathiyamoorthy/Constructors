package com.vstl.javaConstructors;

public class JavaConstructor {
	
	//Non parameterized/default constructor
	
	JavaConstructor() {
			
			this("Vidya", "Software Testing");
			System.out.println("End of Employee Salary Report");
			
	}
	
	//Parameterized / user defined constructor
	
	JavaConstructor(double doubleempsal) {
		
		System.out.println("Fixed Salary is " +doubleempsal);
	}
	
	JavaConstructor(int intmonths, int intcalc) {
		
		this(20000);
		double doublepermonth = 20000;
		double doublecalc = (double)intmonths*doublepermonth;
		System.out.println("Total Pending Salary : " +doublecalc);
		
	}
		
	//calling multiple constructors using this calling statement
	JavaConstructor(String stringname, String stringdept) {
		
		this(5, 0);
		System.out.println("Employee Name " +stringname);
		System.out.println("Employee Dept " +stringdept);
		
	}

}
