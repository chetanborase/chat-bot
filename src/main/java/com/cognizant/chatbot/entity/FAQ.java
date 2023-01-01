package com.cognizant.chatbot.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Nationalized;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "TblFAQ")
@Data
public class FAQ {

    @Id
    private Long id;

    @Lob
    private String question;

    @Lob
    @Column(length = Integer.MAX_VALUE)
    private String answer;
}
