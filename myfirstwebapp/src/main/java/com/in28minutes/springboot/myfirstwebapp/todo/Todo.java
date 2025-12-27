package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	
	@Size(min=10,message="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public Todo(int id, String usernameString, String descroption, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = usernameString;
		this.description = descroption;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public Todo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descroption) {
		this.description = descroption;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", usernameString=" + username + ", descroption=" + description
				+ ", targetDate=" + targetDate + ", done=" + done + "]";
	}

}
