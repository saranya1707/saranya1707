package org.variables;

public class Login {
	
	
		//instance varaible
	  int a=10;
	  int b=20;
	 
	 private void localVaraible() {
		
		  System.out.println(a);
		  System.out.println(b);
		  
		
	}
		
	 private void localVaraible2() {
		 System.out.println(a+1);
		 System.out.println(b+1);
		
	}
	 
	 
	public static void main(String[] args) {
		Login l=new Login();
		l.localVaraible();
		l.localVaraible2();
		System.out.println(l.a);
		System.out.println(l.b);
	}
	
}
