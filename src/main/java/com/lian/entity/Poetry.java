package com.lian.entity;

import java.util.Date;

public class Poetry {
	private int id;
	private String title;
	private String content;
//	private Date created_at;
//	private Date updated_at;

	private Poet poet;
	
	public Poetry() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

//	public Date getCreated_at() {
//		return created_at;
//	}
//
//	public void setCreated_at(Date created_at) {
//		this.created_at = created_at;
//	}
//
//	public Date getUpdated_at() {
//		return updated_at;
//	}
//
//	public void setUpdated_at(Date updated_at) {
//		this.updated_at = updated_at;
//	}

	public Poet getPoet() {
		return poet;
	}

	public void setPoet(Poet poet) {
		this.poet = poet;
	}
	
	
}
