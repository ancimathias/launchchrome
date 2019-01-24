package com.abc.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pgm3 
{
	
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
		
}
