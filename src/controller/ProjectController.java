package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConnectionFactory;
import model.Project;

public class ProjectController {
	
	
	public void save(Project project) {
		String sql = "insert into projects (project_name, descriptionn, createdAt, updatedAt)values(?,?,?,?);";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, project.getProject_name());
			ps.setString(2, project.getProject_name());
			ps.setDate(3, new Date(project.getCreatedAt().getTime()));
			ps.setDate(4, new Date(project.getUpdatedAt().getTime()));
			
			ps.execute();
			
			
		}catch(SQLException e) {}
		finally{
			ConnectionFactory.CloseConnection();
		}
	}
	
	public void update(Project project) {
		String sql = "update projects set project_name = ?,\r\n"
				+ "descriptionn = ?,\r\n"
				+ "createdAt = ?,\r\n"
				+ "updatedAt = ?\r\n"
				+ "where id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, project.getProject_name());
			ps.setString(2, project.getProject_name());
			ps.setDate(3, new Date(project.getCreatedAt().getTime()));
			ps.setDate(4, new Date(project.getUpdatedAt().getTime()));
			ps.setInt(5, project.getId());
			
			ps.execute();
			
		}catch(SQLException e) {
			
		}finally {
			ConnectionFactory.CloseConnection();
		
		}
	}
	public List<Project> getAll(){
		
		String sql = "select * from projects";
		List<Project> projects = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Project project = new Project();
				project.setId(rs.getInt("id"));
				project.setProject_name(rs.getString("project_name"));
				project.setProject_description(rs.getString("descriptionn"));
				project.setCreatedAt(rs.getDate("createdAt"));
				project.setUpdatedAt(rs.getDate("updatedAt"));
				
				projects.add(project);				
				
			}
			
		}catch(SQLException e) {}finally {
			ConnectionFactory.CloseConnection();
		}
		
	}
	
	public void removeById(int idProject) {
		String sql = "delete from projects where id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idProject);
			ps.execute();
			
		}catch(SQLException e) {
			
		}finally {ConnectionFactory.CloseConnection();}
		
	}
	

}
