package com.cts.springadb.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.springadb.entity.ContactEntity;
@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

	

}
