package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Dao 
{
	public static Connection getConnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Showdata","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int savedata(Model m)
	{
		int status = 0;
		Connection con = Dao.getConnect();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into data(name,email,phone) values (?,?,?)");
			
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getPhone());
			
			status = ps.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<Model> viewdata()
	{
		Connection con = Dao.getConnect();
		ArrayList<Model> list = new ArrayList();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from data");
			ResultSet set = (ResultSet) ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String phone = set.getString(4);
				
				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setEmail(email);
				m.setPhone(phone);
				
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
