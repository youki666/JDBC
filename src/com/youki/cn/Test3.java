package com.youki.cn;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.youki.user.User;
import com.youki.cn.DButils;

public class Test3 {
	/*@Test
	public void testSelect(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DButils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from users");
			List<User> list = new ArrayList<User>();
			while(rs.next()){
				User u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setBirthday(rs.getDate(5));
				list.add(u);
			}
			
			for (User user : list) {
				System.out.println(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DButils.closeAll(rs, stmt, conn);
		}
	}*/
/*		@Test
		public void testInsert(){
			Connection conn = null;
			PreparedStatement stmt = null;
		
			try {
				conn = DButils.getConnection();
				String sql = "INSERT INTO users VALUES (?, ?, ?,?,?)";
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, 7);
				stmt.setString(2, "youki");
				stmt.setInt(3, 323);
				stmt.setString(4, "youki@163.com");
				stmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
				stmt.setString(5, "1940-09-11");
				
				int i = stmt.executeUpdate();
				if(i>0){
					System.out.println("success");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				DButils.closeAll(null, stmt, conn);
			}
		}*/
/*		@Test
		public void testUpdate(){
			Connection conn = null;
			PreparedStatement stmt = null;
		
			try {
				conn = DButils.getConnection();
				String sql = "UPDATE users SET NAME=?,PASSWORD=?,email=? WHERE id=?";
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, "jerry123");
				stmt.setString(2, "123");
				stmt.setString(3, "jerry@163.com");
				stmt.setInt(4, 5);
				
				int i = stmt.executeUpdate();
				if(i>0){
					System.out.println("success");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				DButils.closeAll(null, stmt, conn);
			}
		}*/
		
		@Test
		public void testDelete(){
			Connection conn = null;
			Statement stmt = null;
		
			try {
				conn = DButils.getConnection();
				stmt = conn.createStatement();
				int i = stmt.executeUpdate("DELETE FROM users WHERE id=3");
				if(i>0){
					System.out.println("success");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				DButils.closeAll(null, stmt, conn);
			}
		}
}


