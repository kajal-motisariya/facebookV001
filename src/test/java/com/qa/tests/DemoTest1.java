package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test(priority = 1)
	public void sum() {
		int a=10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		System.out.println("sum");
	}
	
	@Test(priority = 2)
	public void div() {
		int a=10;
		int b = 20;
		Assert.assertEquals(10, b-a);
		System.out.println("div");

	}
	
	@Test(priority = 3)
	public void mul() {
		int a=10;
		int b = 20;
		Assert.assertEquals(200, a*b);
		System.out.println("mul");

	}

}
