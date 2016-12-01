package com.ap.controller.ARSControllers;

import com.arspracticeservices.app.Calculator;

public class CalculatorController {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		System.out.println(calc.add(5, 6));
	}
}
