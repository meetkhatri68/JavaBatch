package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.model;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module4","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static List<model> viewdata()
	{
		Connection con = Dao.getconnect();
		ArrayList<model> list = new ArrayList();
		
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from Que5");
			ResultSet set = (ResultSet) ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				
				model m = new model();
				
				m.setId(id);
				m.setFname(fname);
				m.setLname(lname);
				
				list.add(m);
			}
		
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}	
}
