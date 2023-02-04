package model;

import java.util.Date;

public class Task {
	
	private int id;
	private int id_Project;
	private String task_name;
	private String task_description;
	private String notes;
	private boolean isCompleted;
	private Date createdAt;
	private Date updatedAt;
	
	public Task(int id, int id_Project, String task_name, String task_description, String notes, boolean isCompleted,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.id_Project = id_Project;
		this.task_name = task_name;
		this.task_description = task_description;
		this.notes = notes;
		this.isCompleted = isCompleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Project() {
		return id_Project;
	}

	public void setId_Project(int id_Project) {
		this.id_Project = id_Project;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
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
		return "Task [id=" + id + ", id_Project=" + id_Project + ", task_name=" + task_name + ", task_description="
				+ task_description + ", notes=" + notes + ", isCompleted=" + isCompleted + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	
	
	

}
