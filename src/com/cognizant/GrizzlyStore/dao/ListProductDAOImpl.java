package com.cognizant.GrizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.GrizzlyStore.bean.Product;
import com.cognizant.GrizzlyStore.util.DBUtils;



public class ListProductDAOImpl implements ListProductDAO {
	
	private static ListProductDAOImpl listProductDAOImpl;
	public static ListProductDAOImpl getInstance()
	{
		if(listProductDAOImpl==null)
		{
			listProductDAOImpl =new ListProductDAOImpl();
			return listProductDAOImpl;
		}
		else
		{
			return listProductDAOImpl;
		}
	}
	
	private ListProductDAOImpl()
	{
		
	}

	public ArrayList<Product> displayProduct() {
		// TODO Auto-generated method stub
		
		String query="select name,brand,category,rating from product";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		ArrayList<Product> dataList=new ArrayList<Product>();
		connection=DBUtils.getConnection();
		
		try {
			preparedStatement=connection.prepareStatement(query);
			//preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			
			
			if (resultSet.next()) {
				
				
			String a=resultSet.getString("name");
			String b=resultSet.getString("brand");
			String c=resultSet.getString("category");
			String d=resultSet.getString("rating");
			Product pro=new Product(a,b,c,d);
			dataList.add(pro);
			
				
				
				
			}
			
			return dataList;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return null;
	}

}
