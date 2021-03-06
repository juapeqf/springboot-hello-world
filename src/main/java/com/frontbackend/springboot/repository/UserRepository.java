package com.frontbackend.springboot.repository;

import com.frontbackend.springboot.models.User;
import org.springframework.data.repository.CrudRepository;




// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Integer> {
    // @Override
    // Optional<User> findById(Integer id);

    //  List<User> findByName(String name);
}
