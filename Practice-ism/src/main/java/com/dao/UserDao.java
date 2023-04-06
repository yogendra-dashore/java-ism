package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public void addUser(UserBean userBean) {
		
		  Connection con=null;
		try {
			con = DbConnection.getConnection();
			
			PreparedStatement pstm = con.prepareStatement("insert into USER1 (firstName,email,password) values (?,?,?) ");
			pstm.setString(1, userBean.getFirstName());
			pstm.setString(2, userBean.getEmail());
			pstm.setString(3, userBean.getPassword());
			
		      pstm.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	public UserBean authenticate(String email, String password) {
		UserBean user = null;
		Connection con =null;
		try {
			con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from USER1 where email = ? and password = ?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) { 
				user = new UserBean();
				user.setFirstName(rs.getString("firstName"));
				user.setUserId(rs.getInt("userId"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return user;
	}

	public ArrayList<UserBean> getAllUsers() {
		ArrayList<UserBean> users = new ArrayList<UserBean>();

		Connection con =null;
		try {
			con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from USER1");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) { 
				UserBean user = new UserBean();
				user.setFirstName(rs.getString("firstName"));
				user.setUserId(rs.getInt("userId"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return users;
	}

	public void deleteUser(Integer userId) {
		Connection con=null;
		try {
			con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from USER1 where userId = ? ");
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	public ArrayList<UserBean> search(String name) {
            ArrayList<UserBean> users = new ArrayList<UserBean>();
		
           Connection con=null; 
		try {
		con = DbConnection.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from USER1 where firstName like ?");
		ps.setString(1,name+"%");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			UserBean user = new UserBean();
			user.setFirstName(rs.getString("firstName"));
			user.setUserId(rs.getInt("userId"));
			user.setEmail(rs.getString("email"));
		    user.setPassword(rs.getString("password"));
		    
		    users.add(user);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}}
		return users;
	}
	public UserBean getUserById(Integer userId) {
		UserBean user = null;
		
		Connection con=null;
		try {
			con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from USER1 where userId = ?");
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = new UserBean();
				user.setFirstName(rs.getString("firstName"));
				user.setUserId(rs.getInt("userId"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
		
	}

	
public void updateUser(UserBean userBean) {

	Connection con =null;
	try {
		con = DbConnection.getConnection();
		PreparedStatement pstmt = con.prepareStatement("update USER1 set firstName = ?, email = ? where userID = ?");
		pstmt.setString(1, userBean.getFirstName());
		pstmt.setString(2, userBean.getEmail());
		pstmt.setInt(3, userBean.getUserId());
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
}
}
