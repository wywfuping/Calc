package com.wang.calc;

public class Test {

	public static void main(String[] args) {
		CalcFactory cf = new CalcFactory();
		Calc c = cf.cal("*");
		System.out.println(c.cul(10, 2));
	}

}
