package com.entity;

public class TaskList {
	int id;
	String task;
	String status;

	public TaskList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskList(int id, String task, String status) {
		super();
		this.id = id;
		this.task = task;
		this.status = status;
	}

	public TaskList(String task, String status) {
		super();
		this.task = task;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", task=" + task + ", status=" + status + "]";
	}

}
