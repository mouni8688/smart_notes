package com.smartnotes.smart_notes.repository;

import com.smartnotes.smart_notes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{

    
}
