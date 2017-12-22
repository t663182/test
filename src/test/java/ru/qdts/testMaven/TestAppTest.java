package ru.qdts.testMaven;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;

public class TestAppTest {

	TestApp testApp = new TestApp();
	
	@Test
	public void sumTest() {
		int res = testApp.sum(1, 2);
		Assert.assertEquals(3, res);
	}
	
	@Test
	public void decTest() {
		int res = testApp.dec(1, 2);
		Assert.assertEquals(-1, res);
	}
}
