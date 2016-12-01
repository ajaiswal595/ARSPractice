package com.ap.controller.ARSControllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arspracticeservices.app.Calculator;

public class ARSFrontController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		
		Calculator calc =new Calculator();
		resp.addIntHeader("addvalue", calc.add(77, 88));
	}

}
