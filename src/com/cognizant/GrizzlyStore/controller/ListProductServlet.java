package com.cognizant.GrizzlyStore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.GrizzlyStore.service.ListProductService;
import com.cognizant.GrizzlyStore.service.ListProductServiceImpl;

/**
 * Servlet implementation class ListProductServlet
 */
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListProductService lps=ListProductServiceImpl.getInstance();
		 lps.displayProduct();
		 
	}

}
