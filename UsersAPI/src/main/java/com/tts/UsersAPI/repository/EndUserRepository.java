package com.tts.UsersAPI.repository;

import com.tts.UsersAPI.model.EndUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndUserRepository extends CrudRepository<EndUser, Long> {
}
