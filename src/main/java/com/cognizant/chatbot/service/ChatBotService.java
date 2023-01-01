package com.cognizant.chatbot.service;

import com.cognizant.chatbot.dto.Message;
import com.cognizant.chatbot.entity.FAQ;
import com.cognizant.chatbot.repository.ChatBotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChatBotService {

    private final ChatBotRepository chatBotRepository;

    public ChatBotService(ChatBotRepository chatBotRepository) {
        this.chatBotRepository = chatBotRepository;
    }

    public List<Message> searchQuestions(String keyword){
        List<FAQ> faqs = chatBotRepository.searchFAQByQuestionContainsOrAnswerContaining(keyword,keyword);

        List<Message> messages = new ArrayList<>();
        for (FAQ q : faqs) {
            messages.add(Message.mapFromFAQ(q));
        }

        return messages;
    }

    public Message getById(Long id) {
        FAQ faq   = chatBotRepository.findFAQById(id);
        return Message.mapFromFAQ(faq);
    }
}
