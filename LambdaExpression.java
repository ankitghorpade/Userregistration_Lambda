package com;

import org.junit.Test;

import java.util.Scanner;
import java.util.regex.*;
@FunctionalInterface
interface Lamda{
	Boolean eval(String value);
}
public class LambdaExpression {

	@Test
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name: ");
		String firstName = sc.next();
        Lamda Name=(String value) -> Pattern.matches("^[A-Z a-z]{3,25}$",firstName);
		System.out.println(Name.eval("value"));
		
		System.out.println("Enter Last Name: ");
		String LastName = sc.next();
        Lamda Lastname=(String value) -> Pattern.matches("^[A-Z a-z]{3,25}$",LastName);
		System.out.println(Lastname.eval("value"));
		
    	 System.out.println("Enter Email : ");
	     String Email1 = sc.next();
	     Lamda Email=(String value) -> Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$",Email1);
	   	System.out.println(Email.eval("value"));
			
			System.out.println("Enter mobile number : ");
	        String Mobile1 = sc.next();
	        Lamda Mobile=(String value) -> Pattern.matches("^[A-Z a-z]{3,25}$",Mobile1);
			System.out.println(Mobile.eval("value"));
	}

}