package com.cognizant.chatbot.controller;

import com.cognizant.chatbot.entity.FAQ;
import com.cognizant.chatbot.service.ChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/chatbot")
public class ChatBotController{
    @Autowired
    private ChatBotService chatBotService;

    //localhost:8080/chatbot?key=password
    @GetMapping
    public ResponseEntity<List<FAQ>> searchFAQ(@RequestParam(name = "key") String key){
        List<FAQ> questions = chatBotService.searchQuestions(key);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}