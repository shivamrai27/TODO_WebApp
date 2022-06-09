package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.TaskList.*;
import com.mysql.cj.protocol.Resultset;
import com.sun.tools.javac.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.TaskList;

public class TodoDAO {
private Connection conn;

public TodoDAO(Connection conn) {
	super();
	this.conn = conn;
}
 public boolean addTask(String task, String status) {
	 
	 boolean f =false;
	 	try {
			String query ="insert into tasks(task,status) values(?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,task);
			ps.setString(2, status);
			int i =ps.executeUpdate();
			if (i>0) {
				f=true;
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	 return f;
 }
 
public ArrayList<TaskList> getTodo() {
	ArrayList <TaskList> list = new ArrayList<TaskList>();
	TaskList l;
	try {
		String sql ="select * from task";
		PreparedStatement ps= conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			l=new TaskList();
			rs.getInt(rs.getInt(1));
			rs.getString(2);
			rs.getString(3);
			list.add(l);
			
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return list;
}
}
