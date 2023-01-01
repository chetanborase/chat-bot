package com.cognizant.chatbot.repository;

import com.cognizant.chatbot.entity.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatBotRepository extends JpaRepository<FAQ,Long> {

    public List<FAQ> searchFAQByQuestionContainsOrAnswerContaining(String question, String answer);
    public FAQ findFAQById(Long id);

}
