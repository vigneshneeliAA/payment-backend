package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Message;
import com.example.repo.MessageRepo;

@Service
public class MessageService implements IMessageService {
	@Autowired
	MessageRepo mr;
	
	@Override
	public Message addMessage(Message m)
	{
		return mr.save(m);
	}
	
	@Override
	public Message findById(String id)
	{
		return mr.getById(id);
	}
	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return mr.findAll();	}



	@Override
	public Message updateMessage(Message m) {
		// TODO Auto-generated method stub
		return mr.save(m);
	}
	

}
