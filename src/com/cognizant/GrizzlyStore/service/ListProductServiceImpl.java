package com.cognizant.GrizzlyStore.service;

import java.util.ArrayList;

import com.cognizant.GrizzlyStore.bean.Product;
import com.cognizant.GrizzlyStore.dao.ListProductDAO;
import com.cognizant.GrizzlyStore.dao.ListProductDAOImpl;


public class ListProductServiceImpl implements ListProductService {
	
	private static ListProductServiceImpl listProductServiceImpl;
private ListProductDAO dao=ListProductDAOImpl.getInstance();
	
	public static ListProductServiceImpl getInstance()
	{
		if(listProductServiceImpl==null)
		{
			listProductServiceImpl =new ListProductServiceImpl();
			return listProductServiceImpl;
		}
		else
		{
			return listProductServiceImpl;
		}
	}
	
	private ListProductServiceImpl()
	{
		
	}

	public ArrayList<Product> displayProduct() {
		// TODO Auto-generated method stub
		return dao.displayProduct();
	}
	
	

	
}
