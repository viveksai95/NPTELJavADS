package com.nptel.obj.week1;

public class Question1 {

	public static <T> void printArray(T[] input) {
		for (T t : input) {
			System.out.printf("%s ", t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = { 1, 2, 3, 4, 5 };
		printArray(A);

	}

}
