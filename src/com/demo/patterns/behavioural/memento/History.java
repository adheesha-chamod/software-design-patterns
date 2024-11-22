package com.demo.patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<EditorState> states;

    public History() {
        states = new ArrayList<>();
    }

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        if (states.isEmpty()) {
            throw new IllegalStateException();
        }

        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
