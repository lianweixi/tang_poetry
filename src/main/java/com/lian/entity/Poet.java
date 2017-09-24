package com.lian.entity;

import java.util.Date;
import java.util.Set;

public class Poet {
	private int id;
	private String name;
//	private Date created_at;
//	private Date updated_at;
	
//	private Set<Poetry> poetries;
	
	public Poet() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

//	public Set<Poetry> getPoetries() {
//		return poetries;
//	}
//
//	public void setPoetries(Set<Poetry> poetries) {
//		this.poetries = poetries;
//	}

	@Override
	public String toString() {
		return "Poet [id=" + id + ", name=" + name +"]";
	}
	
	
	
}
