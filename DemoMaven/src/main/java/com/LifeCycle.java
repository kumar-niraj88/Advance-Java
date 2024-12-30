package com;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle extends GenericServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("hi this is init method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi this is service method");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("hi this is destroy method");
	}
     

}
