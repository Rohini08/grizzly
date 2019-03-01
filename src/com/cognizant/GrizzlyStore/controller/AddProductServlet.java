package com.cognizant.GrizzlyStore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.GrizzlyStore.bean.Product;
import com.cognizant.GrizzlyStore.service.AddProductService;
import com.cognizant.GrizzlyStore.service.AddProductServiceImpl;


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
		
		
		String productId=request.getParameter("productId");
		String category=request.getParameter("");
		String description=request.getParameter("productDescription");
		String name=request.getParameter("productName");
		float price=Float.parseFloat(request.getParameter("productPrice"));
		String brand=request.getParameter("brand");
			 
		Product pro=new Product();
		
		pro.setProductId(productId);
		pro.setCategory(category);
		pro.setDescription(description);
		pro.setName(name);
		pro.setPrice(price);
		pro.setBrand(brand);
		
		AddProductService addProductService=AddProductServiceImpl.getInstance();
		  
		addProductService.insertProduct(pro);
		
		
		
	}

}
