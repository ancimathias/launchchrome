package com.abc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pgm4 {
	
	@Test
	public void testcase1()
	{
		System.out.println("executing test case1");
		
	}

	@Test
	public void testcase2()
	{
		System.out.println("executing test case2");
		
	}
	@BeforeTest
	public void before()
	{
		System.out.println("Inside beforeTest method annotation");
		
	}
	@AfterTest
	public void after()
	{
		System.out.println("Inside afterTestmethod annotation");
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Inside beforeclass method annotation");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Inside afterclassmethod annotation");
		
	}
		

}
