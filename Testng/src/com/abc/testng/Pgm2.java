package com.abc.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pgm2
{
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
@BeforeMethod
public void before()
{
	System.out.println("Inside beforemethod annotation");
	
}
@AfterMethod
public void after()
{
	System.out.println("Inside aftermethod annotation");
	
}
	
	
	
}
