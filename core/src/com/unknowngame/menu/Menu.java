package com.unknowngame.menu;

public enum Menu {
    START_MENU(new StartMenu());

    private Screen screen;
    Menu(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }
}
