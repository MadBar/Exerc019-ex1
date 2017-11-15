package com.example.maven.Exerc019_ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {
	MyRandomMethods mrm = new MyRandomMethods();

	@Test
	public void test1() {
		//This will give us 100 000 tests. 
		int result= 0;
		for(int i= 0; i<100000; i++) {
			result = mrm.randomBetween1And10();
			System.out.println("Iteration: "+i+". Testing method with value: "+result);
			
			assertTrue((result >=1)&& (result <=10));
		}
		
		
		//Utan loop
//		int result = mrm.randomBetween1And10();
//		System.out.println("Testing method with value: "+result);
//		
//		assertTrue((result >=1)&& (result <=10));
	}
	
	@Test
	public void test2() {
		int result = mrm.randomBetween11And20();
		
		assertTrue((result >=11)&& (result <=20));
	}
	
	@Test
	public void test3() {
		int result = mrm.randomBetween21And30();
		
		assertTrue((result >=21)&& (result <=30));
	}
	
	@Test
	public void test4() {
		int result = mrm.randomBetween31And40();
		
		assertTrue((result >=31)&& (result <=40));
	}
	@Test
	public void test5() {
		int result = mrm.randomBetween41And50();
		
		assertTrue((result >=41)&& (result <=50));
	}
}
