package com.ap.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.entity.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Serializable> {

}
