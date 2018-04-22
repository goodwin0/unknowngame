package com.unknowngame.views.menu;

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
