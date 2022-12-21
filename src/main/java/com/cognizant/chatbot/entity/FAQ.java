package com.cognizant.chatbot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table("TblFAQ")
@Data
public class FAQ {

    @Id
    private Long id;

    private String question;
    private String answer;
}
