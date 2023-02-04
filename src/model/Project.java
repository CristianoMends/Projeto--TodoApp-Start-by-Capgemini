package model;

import java.util.Date;

public class Project {
	
	private int id;
	private String project_name;
	private String project_description;
	private Date createdAt;
	private Date updatedAt;
	
	public Project(int id, String project_name, String project_description, Date createdAt, Date updatedAt) {
		this.id = id;
		this.project_name = project_name;
		this.project_description = project_description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Project id=" + id + ", project_name=" + project_name + ", project_description=" + project_description
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt;
	}
	
	
	
	
	
	

}
