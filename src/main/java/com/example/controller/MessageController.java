package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Message;
import com.example.service.IMessageService;

@RestController
public class MessageController {
	
	@Autowired
	IMessageService ims;
	
	@PostMapping(value="message")
	public Message addMessages(@RequestBody Message m)
	{
		return ims.addMessage(m);
	}
	

}
