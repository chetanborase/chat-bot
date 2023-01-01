package com.cognizant.chatbot.controller;

import com.cognizant.chatbot.dto.Message;
import com.cognizant.chatbot.service.ChatBotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/chatbot")
public class ChatBotController{
    private final ChatBotService chatBotService;

    public ChatBotController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @GetMapping
    public ResponseEntity<List<Message>> searchMessage(@RequestParam(name = "key") String key){
        List<Message> questions = chatBotService.searchQuestions(key);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable Long id){
        Message message = chatBotService.getById(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}