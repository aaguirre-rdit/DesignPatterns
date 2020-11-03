package com.wandercoder;

import com.wandercoder.interfaces.Observer;
import com.wandercoder.model.EmailTopic;
import com.wandercoder.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        // create observers

        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        // Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // Check for update

        firstObserver.update();

        // Provider/ Subject (broadcaster)

        topic.postMessage("Hello Subscribers!");


    }
}
