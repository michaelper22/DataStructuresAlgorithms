package com.michael.dsalgo.chap1.tests;

import static org.junit.Assert.*;

import com.michael.dsalgo.chap1.*;

import org.junit.Test;

public class Chapter1ExercisesTests {

	@Test
	public void r01_03_WhenMultiple_ThenTrue() {
		assertTrue("10 should be a multiple of 5", new Chapter1Exercises().r01_03IsMultiple(10, 5));
	}
	
	@Test
	public void r01_03_WhenNotMultiple_ThenFalse(){
		assertFalse("10 should not be a multiple of 3", new Chapter1Exercises().r01_03IsMultiple(10, 3));
	}
	
	@Test
	public void r01_04_WhenEven_ThenTrue(){
		assertTrue("12 should be even", new Chapter1Exercises().r01_04IsEven(12));
	}
	
	@Test
	public void r01_04_WhenOdd_ThenFalse(){
		assertFalse("13 should be odd", new Chapter1Exercises().r01_04IsEven(13));
	}
	
	@Test
	public void r01_05_WhenNEqualZero_ThenZero(){
		assertEquals("Sum of first 0 positive integers should be 0", 0, new Chapter1Exercises().r01_05sumFirstNNumbers(0));
	}
	
	@Test
	public void r01_05_WhenNGreaterThanZero_ThenSum(){
		assertEquals("Sum of first 5 positive integers should be 15", 15, new Chapter1Exercises().r01_05sumFirstNNumbers(5));
	}
	
	@Test
	public void r01_06_WhenNEqualZero_ThenZero(){
		assertEquals("Sum of first 0 odd integers should be 0", 0, new Chapter1Exercises().r01_06SumFirstNOddNumbers(0));
	}
	
	@Test
	public void r01_06_WhenNGreaterThanZero_ThenSum(){
		assertEquals("Sum of first 7 odd integers should be 49", 49, new Chapter1Exercises().r01_06SumFirstNOddNumbers(7));
	}
	
	/*
	 * Write a short Java method that counts the number of vowels in a given character string.
	 */
	@Test
	public void r01_08_WhenAllConsonants_ThenZero(){
		assertEquals("'bcdfg' has 0 vowels", 0, new Chapter1Exercises().r01_08CountVowels("bcdfg"));
	}
	
	@Test
	public void r01_08_WhenLowercaseVowels_ThenCount(){
		assertEquals("'abcde' has 2 vowels", 2, new Chapter1Exercises().r01_08CountVowels("abcde"));
	}

}














