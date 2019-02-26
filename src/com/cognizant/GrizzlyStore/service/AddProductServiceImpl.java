package com.cognizant.GrizzlyStore.service;

import com.cognizant.GrizzlyStore.bean.Product;
import com.cognizant.GrizzlyStore.dao.AddProductDAO;
import com.cognizant.GrizzlyStore.dao.AddProductDAOImpl;

public class AddProductServiceImpl implements AddProductService{
	
private static AddProductServiceImpl addProductServiceImpl;
	
	private AddProductDAO dao=AddProductDAOImpl.getInstance();
	
	public static AddProductServiceImpl getInstance()
	{
		if(addProductServiceImpl==null)
		{
			addProductServiceImpl =new AddProductServiceImpl();
			return addProductServiceImpl;
		}
		else
		{
			return addProductServiceImpl;
		}
	}
	
	private AddProductServiceImpl()
	{
		
	}

	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.insertProduct(product);
		
		
		
	}

}
