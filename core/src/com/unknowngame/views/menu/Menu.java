package com.unknowngame.views.menu;

public enum Menu {
    START_MENU(new StartMenu());

    private GameScreen gameScreen;
    Menu(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }
}
