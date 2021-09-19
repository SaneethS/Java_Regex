package com.javaregex;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author saneeths
 *class where validation of the user registration is done using java regex
 */
public class UserRegistrationRegex {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to java regex user registration problem");
		firstName();
		lastName();
		email();
		mobileNo();
		
	}
	
	/**
	 * method where first name of the user is validated
	 */
	public static void firstName() {
		String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
		System.out.println("Enter first name");
		String firstName = scanner.nextLine();
		validator(patternFirstName, firstName, "First Name");
	}
	
	/**
	 * method where last name of the user validated
	 */
	public static void lastName() {
		String patternLastName = "^[A-Z]{1}[a-zA-Z]{2,}";
		System.out.println("Enter last name");
		String lastName = scanner.nextLine();
		validator(patternLastName, lastName, "Last Name");
	}
	
	/**
	 * method where email of the user is validated
	 */
	public static void email() {
		String patternEmail = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
		System.out.println("Enter email");
		String email = scanner.nextLine();
		validator(patternEmail, email, "Email");
	}
	
	/**
	 * method where mobile number of the user is validated
	 */
	public static void mobileNo() {
		String patternMobileNo = "^[0-9]{2}[\\s][0-9]{10}";
		System.out.println("Enter Mobile No.");
		String mobileNo = scanner.nextLine();
		validator(patternMobileNo, mobileNo, "Mobile Number");
	}
	
	/**
	 * method where password of the user is validated
	 */
	public static void password() {
		String patternPassword = "^[a-zA-Z0-9]{8}";
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		validator(patternPassword, password, "Password");
		
	}
	
	/**method where the pattern is matched with input
	 * @param pattern
	 * @param input
	 * @param type
	 */
	public static void validator(String pattern, String input, String type) {
		if(Pattern.matches(pattern, input)) {
			System.out.println(input+" is valid "+type);
		}else
			System.out.println(input+" is not valid "+type);
	}
}
