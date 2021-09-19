package com.javaregex;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to java regex user registration problem");
		firstName();
		
	}
	
	public static void firstName() {
		String patternFirstName = "[A-Z]{1}[a-zA-Z]{2,}";
		System.out.println("Enter first name");
		String firstName = scanner.nextLine();
		validator(patternFirstName, firstName, "First Name");
	}
	
	public static void validator(String pattern, String input, String type) {
		if(Pattern.matches(pattern, input)) {
			System.out.println(input+" is valid "+type);
		}else
			System.out.println(input+" is not valid "+type);
	}
}
