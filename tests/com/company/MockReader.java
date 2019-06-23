package com.company;

import java.util.List;

public class MockReader implements Reader {

    private List<String> userResponses;
    private int callCounter = -1;

    MockReader(List<String> userResponses) {
        this.userResponses = userResponses;
    }

    @Override
    public String prompt(String message) {
        callCounter++;

        if (callCounter == userResponses.size()) {
            callCounter = 0;
        }

        return userResponses.get(callCounter);
    }
}
