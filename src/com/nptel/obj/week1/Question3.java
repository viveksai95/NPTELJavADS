package com.nptel.obj.week1;

class Demo<T> {
	T t;
	
	Demo(){
		
	}

	Demo(T t) {
		this.t = t;
	}

	public T DemoMethod() {
		return this.t;
	}
}

public class Question3 extends Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<Integer> i = new Demo<>(5);
		System.out.println(i.DemoMethod());
		
		Demo<Double> f = new Demo<>(14.6);
		System.out.println(f.DemoMethod());
	}

}
