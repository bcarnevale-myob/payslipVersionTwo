package com.company;

import java.util.ArrayList;
import java.util.List;

public class MockWriter implements Writer {

    List<String> messagesReceived;

    MockWriter() {
        this.messagesReceived = new ArrayList<>();
    }

    @Override
    public void write(String message) {
        this.messagesReceived.add(message);
    }

}
