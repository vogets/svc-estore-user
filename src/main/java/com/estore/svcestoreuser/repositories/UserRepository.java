package com.estore.svcestoreuser.repositories;


import com.estore.svcestoreuser.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User,Integer> {
}
