package com.unknowngame.menu;

import com.badlogic.gdx.utils.Array;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScreenManager {
    public Screen activeScreen;

    public ScreenManager() {
    }

    public Screen getActiveScreen() {
        return activeScreen;
    }

    public void setActiveScreen(Screen activeScreen) {

        this.activeScreen = activeScreen;
    }
}
