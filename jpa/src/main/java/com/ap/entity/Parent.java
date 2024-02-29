package com.ap.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Parent {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer parentId;
	private String name;
	private String city;
	
	@OneToMany(mappedBy = "parentId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<Child> child=new ArrayList<>();

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", name=" + name + ", city=" + city + ", child=" + child + "]";
	}
	

}
