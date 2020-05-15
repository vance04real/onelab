package com.persistantcoder.onelab.repository;

import com.persistantcoder.onelab.beans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Evans K F C on May ,2020
 **/

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    @Query("SELECT u from User u where u.userName=:name")
    User findByUserName(@Param("name")String username);
}
