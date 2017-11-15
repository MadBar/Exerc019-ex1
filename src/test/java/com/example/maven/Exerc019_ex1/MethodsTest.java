package com.example.maven.Exerc019_ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {
	MyRandomMethods mrm = new MyRandomMethods();

	@Test
	public void test1() {
		int result = mrm.randomBetween1And10();
		
		assertTrue((result >=1)&& (result <=10));
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
