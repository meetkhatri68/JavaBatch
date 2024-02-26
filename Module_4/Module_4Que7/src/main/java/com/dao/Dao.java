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
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	//insert
	
	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into regform(fname,lname,phone,email,gender,password) values (?,?,?,?,?,?)");
			
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getEmail());
			ps.setString(5,m.getGender());
			ps.setString(6,m.getPassword());
			
			status = ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	
	//viewdata
	
	public static List<Model> showdata()
	{
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from regform");
			ResultSet set = (ResultSet) ps.executeQuery();
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String phone = set.getString(4);
				String email = set.getString(5);
				String gender = set.getString(6);
				String password = set.getString(7);
				
				Model m = new Model();
				m.setId(id);
				m.setFname(fname);
				m.setLname(lname);
				m.setPhone(phone);
				m.setEmail(email);
				m.setGender(gender);
				m.setPassword(password);
				
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
	
		//delete data
	
	public static int deletdata(int id)
		{
			int status = 0;
			Connection con = Dao.getconnect();
			
			try 
			{
				PreparedStatement ps = (PreparedStatement) con.prepareStatement("delete from regform where id=?");
				ps.setInt(1, id);
				status = ps.executeUpdate();
			
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
	
	
	//Edit
	
	public static Model getelementbyid(int id)
	{
		Model m = new Model();
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from regform where id=?");
			ps.setInt(1, id);
			ResultSet set = (ResultSet) ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String phone = set.getString(4);
				String email = set.getString(5);
				String gender = set.getString(6);
				String password = set.getString(7);
				
				
				m.setId(id1);
				m.setFname(fname);
				m.setLname(lname);
				m.setPhone(phone);
				m.setEmail(email);
				m.setGender(gender);
				m.setPassword(password);
			}

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
		
	}
	//update data
	
	public static int updatedata(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("update regform set fname=?,lname=?,phone=?,email=?,gender=?,password=? where id=? ");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getPhone());
			ps.setString(4, m.getEmail());
			ps.setString(5, m.getGender());
			ps.setString(6, m.getPassword());
			ps.setInt(7, m.getId());
			
			status = ps.executeUpdate();
		
		
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	
	}

	
}
