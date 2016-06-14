package com.wang.calc;

public class CalcFactory {
	
	public Calc cal(String str){
		Calc c = null;
		switch(str){
		case "+":
			c = new AddCalc();
			break;
		case "-":
			c = new SubCalc();
			break;
		case "*":
			c = new ChengCalc();
			break;
		case "/":
			c = new ChuCalc();
			break;
		}
		return c;
	}
}
