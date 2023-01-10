package org.variables;

public class Login {
	
	
		//instance varaible
	  int a=10;
	 
	 private void localVaraible() {
		
		  System.out.println(a);
		
	}
		
	 private void localVaraible2() {
		 System.out.println(a+1);
		
	}
	 
	 
	public static void main(String[] args) {
		Login l=new Login();
		l.localVaraible();
		l.localVaraible2();
		System.out.println(l.a);
	}
	
}
