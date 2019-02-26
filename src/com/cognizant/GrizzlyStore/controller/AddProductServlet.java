package com.cognizant.GrizzlyStore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.GrizzlyStore.bean.Product;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String productId="abc";
		String category="abc";
		String description="hfdsavb";
		String name="asdfgh";
		float price=20;
			 
		Product pro=new Product();
		
		pro.setProductId(productId);
		pro.setCategory(category);
		pro.setDescription(description);
		pro.setName(name);
		pro.setPrice(price);
		
		
	}

}
