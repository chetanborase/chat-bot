package com.cognizant.chatbot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TblFAQ")
public class FAQ {
    @Id
    private Long id;

    @Lob
    private String question;

    @Lob
    @Column(length = Integer.MAX_VALUE)
    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
