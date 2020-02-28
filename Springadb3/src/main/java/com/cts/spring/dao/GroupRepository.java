package com.cts.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.spring.entity.GroupEntity;


@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, String> {
	

}
