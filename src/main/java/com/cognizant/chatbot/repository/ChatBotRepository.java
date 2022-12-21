package com.cognizant.chatbot.repository;

import com.cognizant.chatbot.entity.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatBotRepository extends JpaRepository<FAQ,Long> {
    public List<FAQ> findByQuestion(String question);
}
