package com.ap.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.entity.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Serializable> {

}
