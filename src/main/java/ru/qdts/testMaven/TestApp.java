package ru.qdts.testMaven;

public class TestApp {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int dec(int a, int b) {
		return a-b;
	}
	
	public void errorMethod(int a, int b) {
		a = 10;
		b = 30;
	}

}
