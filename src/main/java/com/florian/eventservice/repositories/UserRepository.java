package com.florian.eventservice.repositories;

import com.florian.eventservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
