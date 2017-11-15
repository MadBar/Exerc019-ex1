package com.example.maven.Exerc019_ex1;

import java.util.Random;

public class MyRandomMethods {
	Random random = new Random();
	
	public int randomBetween1And10() {
		//Random random = new Random();

		int i = random.nextInt(10) + 1;
		return i;
	}

	public int randomBetween11And20() {
		//Random random = new Random();

		int i = random.nextInt(10) + 11;
		return i;
	}

	public int randomBetween21And30() {
		int i = random.nextInt(10) + 21;
		return i;
	}

	public int randomBetween31And40() {
		int i = random.nextInt(10) + 31;
		return i;
	}

	public int randomBetween41And50() {
		int i = random.nextInt(10) + 41;
		return i;
	}
}
