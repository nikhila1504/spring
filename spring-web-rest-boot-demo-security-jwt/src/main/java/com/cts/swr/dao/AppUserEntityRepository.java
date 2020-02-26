package com.cts.swr.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.swr.model.AppUserEntity;

@Repository
public interface AppUserEntityRepository extends CrudRepository<AppUserEntity,Integer> {
	AppUserEntity findByUsername(String username);
	boolean existsByUsername(String username);
}
