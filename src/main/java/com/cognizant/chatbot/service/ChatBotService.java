package com.cognizant.chatbot.service;

import com.cognizant.chatbot.entity.FAQ;
import com.cognizant.chatbot.repository.ChatBotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatBotService {

    @Autowired
    private ChatBotRepository chatBotRepository;

    public List<FAQ> searchQuestions(String keyword){

        return chatBotRepository.findByQuestion(keyword);
    }
}
