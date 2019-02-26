package com.cognizant.GrizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cognizant.GrizzlyStore.bean.Product;
import com.cognizant.GrizzlyStore.util.DBUtils;



public class AddProductDAOImpl implements AddProductDAO {
	
	private static AddProductDAOImpl addProductDAOImpl;
	public static AddProductDAOImpl getInstance()
	{
		if(addProductDAOImpl==null)
		{
			addProductDAOImpl =new AddProductDAOImpl();
			return addProductDAOImpl;
		}
		else
		{
			return addProductDAOImpl;
		}
	}
	
	private AddProductDAOImpl()
	{
		
	}

	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		String query="insert into product(productid,category,name,description,price) values(?,?,?,?,?)";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,product.getProductId());
			preparedStatement.setString(2,product.getCategory());
			preparedStatement.setString(3,product.getName());
			preparedStatement.setString(4,product.getDescription());
			preparedStatement.setFloat(5,product.getPrice());
			
			int result=preparedStatement.executeUpdate();
			
			System.out.print(result);
				
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

}
