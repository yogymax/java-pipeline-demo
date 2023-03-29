package com.java.demo.sample;

public class JDBCDemo {
	
	public int addition(int num1,int num2) throws Exception {
		if(num1<=0 || num2<=0) {
			throw new Exception("Invalid Params...!");
		}else {
			int result = num1 + num2;
			return result;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method started...!");
		System.out.println("After Clone --> very First Line Added...");
	}

}
