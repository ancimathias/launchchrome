package com.abc.testng;

import org.testng.annotations.Test;

public class DemoGroup2 {
	
	@Test(priority=19)
	public void a_method()
	{
		System.out.println("inside a_method");
		
	}
	@Test(priority=0)
	public void b_method()
	{
		System.out.println("inside b_method");
		
	}
	
	@Test(priority=22)
	public void c_method()
	{
		System.out.println("inside c_method");
		
	}

}
