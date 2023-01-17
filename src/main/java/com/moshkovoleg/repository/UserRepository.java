package com.moshkovoleg.repository;

import com.moshkovoleg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
