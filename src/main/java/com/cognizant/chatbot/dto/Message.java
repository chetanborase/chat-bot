package com.cognizant.chatbot.dto;

import com.cognizant.chatbot.entity.FAQ;
import java.util.Date;

public class Message {
    private Long id;
    private String content;
    private Date timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public static Message mapFromFAQ(FAQ q){
        Message message = new Message();
        message.setId(q.getId());
        message.setContent(q.getAnswer());
        message.setTimestamp(new Date());

        return message;
    }
}
