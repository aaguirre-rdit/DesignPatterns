package com.wandercoder.model;

import com.wandercoder.interfaces.Observer;
import com.wandercoder.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate();
        if (msg == null){
            System.out.println(name + "No new message on this topic");
        } else {
            System.out.println(name + " Retrieving message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
