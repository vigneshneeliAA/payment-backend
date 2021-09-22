package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, String> {

}
