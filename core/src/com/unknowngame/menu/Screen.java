package com.unknowngame.menu;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class Screen {
    protected OrthographicCamera camera;
    protected Vector3 cursor;

    public Screen() {
        camera = new OrthographicCamera();
        cursor = new Vector3();
    }

    public abstract void update(float dt);

    public abstract void render(SpriteBatch sb);

    public abstract void dispose();

    protected abstract void handleInput();

}
