package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.ConnectionFactory;
import model.Task;

public class TaskController {
	public void save(Task task) throws SQLException {
		String sql = "insert into tasks(\r\n"
				+ "id_project,\r\n"
				+ "task_name,\r\n"
				+ "task_description,\r\n"
				+ "completed,\r\n"
				+ "nodes,\r\n"
				+ "deadline,\r\n"
				+ "createdAt,\r\n"
				+ "updatedAt\r\n"
				+ ")values(?,?,?,?,?,?,?,?);";
		
		Connection connection = null;
		PreparedStatement statement = null;
	try {	
		connection = ConnectionFactory.getConnection();
		statement = connection.prepareStatement(sql);
		statement.setInt(1, task.getId_Project());
		statement.setString(2, task.getTask_name());
		statement.setString(3, task.getTask_description());
		statement.setBoolean(4, task.isCompleted());
		statement.setString(5, task.getNotes());
		statement.setDate(6, new Date(task.getCreatedAt().getTime()));
		statement.setDate(7, new Date(task.getCreatedAt().getTime()));
		statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
		statement.execute();
		
	}catch(SQLException e) {
		JOptionPane.showMessageDialog(null, "Erro!");
		
	}finally {
		ConnectionFactory.CloseConnection();
		if(statement != null){
			statement.close();
		}		
		}
	}
	public void update(Task task) {
		String sql = "update tasks set\r\n"
				+ "id_project = ?,\r\n"
				+ "task_name = ?,\r\n"
				+ "task_description = ?,\r\n"
				+ "completed = ?,\r\n"
				+ "nodes = ?,\r\n"
				+ "deadline = ?,\r\n"
				+ "createdAt = ?,\r\n"
				+ "updatedAt = ?\r\n"
				+ "where id = ?;";
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, task.getId_Project());
			ps.setString(2, task.getTask_name());
			ps.setString(3, task.getTask_description());
			ps.setBoolean(4, task.isCompleted());
			ps.setString(5, task.getNotes());
			ps.setDate(6, new Date(task.getCreatedAt().getTime()));
			ps.setDate(7, new Date(task.getCreatedAt().getTime()));
			ps.setDate(8, new Date(task.getUpdatedAt().getTime()));
			ps.execute();
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro");
		}
		
	}
	public void removeById(int taskId) {
		String sql = "delete from tasks wherw id = ?";
		
		Connection conn = null;
		PreparedStatement statement = null;
		try {
			conn = ConnectionFactory.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setInt(1, taskId);
			statement.execute();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro ao deletar a tarefa!");
		}finally{
			ConnectionFactory.CloseConnection();
		}
		
		
	}
	public List<Task> getAll(int idProject){
		String sql = "select * from tasks where id_project = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Task> tasks = new ArrayList<>();
		
		try {
		conn = ConnectionFactory.getConnection();
		ps = conn.prepareStatement(sql);
		ps.setInt(1, idProject);
		rs = ps.executeQuery();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro!");
			
		}
		try {
			while(rs.next()) {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setId_Project(rs.getInt("idProject"));
				task.setTask_name(rs.getString("task_name"));
				task.setTask_description(rs.getString("task_description"));
				task.setNotes(rs.getString("nodes"));
				task.setCompleted(rs.getBoolean("completed"));
				task.setDeadline(rs.getDate("deadline"));
				task.setCreatedAt(rs.getDate("createdAt"));
				task.setUpdatedAt(rs.getDate("updateAt"));
				
				tasks.add(task);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionFactory.CloseConnection();
		}
		return tasks;
	}
	
	
	
}
