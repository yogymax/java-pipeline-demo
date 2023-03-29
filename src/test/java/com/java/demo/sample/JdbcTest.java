package com.java.demo.sample;

import org.testng.annotations.Test;

import junit.framework.Assert;

@Test
public class JdbcTest {

	@Test
	public void testCaseOne() {
		System.out.println("Java Test Case One Executed...");
	}
	
	
	@Test
	public void testCaseTwo() {
		System.out.println("Java Test Case Two Executed...");
	}
	
	@Test
	public void testCaseThree() {
		System.out.println("Java Test Case Three Executed...");
	}
	
	
	@Test(expectedExceptions = {Exception.class})
	public void testAdditionCode1() throws Exception {
		JDBCDemo jdbcDemo = new JDBCDemo();
		System.out.println("Test testAdditionCode1 one...!");
		jdbcDemo.addition(100, -200);
	}
	
	@Test
	public void testAdditionCode2() throws Exception {
		JDBCDemo jdbcDemo = new JDBCDemo();
		System.out.println("Test testAdditionCode2...!");
		int result=  jdbcDemo.addition(100, 200);
		Assert.assertEquals("Addition with 100,200 failed..",300, result);
	}
}
