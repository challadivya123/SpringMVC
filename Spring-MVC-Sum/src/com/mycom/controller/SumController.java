package com.mycom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {
	@RequestMapping("/result")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
	String Number1=request.getParameter("Numbe1");
	String Number2=request.getParameter("Number2");
	int sum=Integer.parseInt(Number1)+Integer.parseInt(Number2);
	String message="sum of two numbers:" +sum;
	return new ModelAndView("sum","message",message);
	}
}
