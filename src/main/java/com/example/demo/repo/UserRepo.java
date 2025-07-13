package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {//(data types methn mainly define krnne)
    //<User, Integer> 1.model class name, 2.primary key data type
}
