package com.example.service;

import java.util.List;

import com.example.beans.Message;

public interface IMessageService {

	Message addMessage(Message m);

	Message findById(String id);

	List<Message> findAll();

	Message updateMessage(Message m);

}