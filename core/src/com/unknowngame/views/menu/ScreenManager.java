package com.unknowngame.views.menu;

public class ScreenManager {
    public GameScreen activeGameScreen;

    public ScreenManager() {
    }

    public GameScreen getActiveGameScreen() {
        return activeGameScreen;
    }

    public void setActiveGameScreen(GameScreen activeGameScreen) {

        this.activeGameScreen = activeGameScreen;
    }
}
