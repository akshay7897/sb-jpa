package com.ap.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ap.entity.Child;
import com.ap.entity.Parent;
import com.ap.repository.ChildRepository;
import com.ap.repository.ParentRepository;

@Service
public class ParentService {
	
	private ParentRepository parentRepository;
	
	private ChildRepository childRepository;

	public ParentService(ParentRepository parentRepository, ChildRepository childRepository) {
		super();
		this.parentRepository = parentRepository;
		this.childRepository = childRepository;
	}
	
	
	public Parent getStudent() {
		Optional<Parent> findById = parentRepository.findById(1);
		return findById.orElse(null);
	}
	
	
	public void save() {
		
		Child child=new Child();
		child.setSchoolName("sangli");
		child.setChildName("Ajinkya");
		
		
		Child child1=new Child();
		child1.setSchoolName("kolhapur");
		child1.setChildName("Amit");
		
		List<Child> asList = Arrays.asList(child,child1);
		
		Parent parent=new Parent();
		parent.setName("Akshay");
		parent.setCity("Pune");
		parent.setChild(asList);
		
		child.setParentId(parent);
		child1.setParentId(parent);
		
		parentRepository.save(parent);
		
		
	}
	

}
