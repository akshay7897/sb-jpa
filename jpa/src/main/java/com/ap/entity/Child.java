package com.ap.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Child {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer childId;
	private String childName;
	private String schoolName;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "parentId")
	private Parent parentId;
	
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Parent getParentId() {
		return parentId;
	}
	public void setParentId(Parent parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "Child [childId=" + childId + ", childName=" + childName + ", schoolName=" + schoolName + "]";
	}
	
	
	
	

}
