package com.zero.project.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.zero.project.domain.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

  public User findByEmail(String email);

}
