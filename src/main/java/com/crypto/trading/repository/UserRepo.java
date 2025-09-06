package com.crypto.trading.repository;

import com.crypto.trading.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
