package com.cognizant.chatbot.dto;

import com.cognizant.chatbot.entity.FAQ;
import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private Long qid;
    private String content;
    private Date timestamp;

    public static Message mapFromFAQ(FAQ q){
        Message message = new Message();
        message.setQid(q.getId());
        message.setContent(q.getAnswer());
        message.setTimestamp(new Date());

        return message;
    }
}
