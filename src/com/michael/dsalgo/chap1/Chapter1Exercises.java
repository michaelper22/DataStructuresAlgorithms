package com.michael.dsalgo.chap1;

public class Chapter1Exercises {
	/**
	 * Determine if n is a multiple of m, that is, n = mi for some integer i
	 * @param m 
	 * @param n Multiple of m
	 * @return
	 */
	public boolean r01_03IsMultiple(long m, long n){
		return m % n == 0;
	}

	public boolean r01_04IsEven(int i) {
		return (i&1) == 0;
	}

	public int r01_05sumFirstNNumbers(int n) {
		return (n * (n+1))/2;
	}
	
	public int r01_06SumFirstNOddNumbers(int n){
		//return ((n+1)/2); //*((n+1)/2);
		//return ((n*n) + (2*n) + 1)/4;
		return (n/4)*n;
	}

	public int r01_08CountVowels(String input) {
		int vowelCount = 0;
		
		for(int i=0; i<input.length(); i++){
			switch (input.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount++;
				break;
			default:
				break;
			}
		}
		
		return vowelCount;
	}
}
