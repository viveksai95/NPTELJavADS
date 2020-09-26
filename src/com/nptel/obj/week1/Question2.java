package com.nptel.obj.week1;

public class Question2 {

	static void DemoMethod(int... v) {
		for (int i : v) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMethod(9, 5, 4);
		DemoMethod();
	}

}
