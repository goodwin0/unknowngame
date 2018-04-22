package com.unknowngame.views.menu;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.unknowngame.services.FileService;
import com.unknowngame.services.FileServiceFactory;

public abstract class GameScreen {
    protected OrthographicCamera camera;
    protected Vector3 cursor;
    public static FileService fileService = FileServiceFactory.getFileService();


    public GameScreen() {
        camera = new OrthographicCamera();
        cursor = new Vector3();
    }

    public abstract void update(float dt);

    public abstract void render(SpriteBatch sb);

    public abstract void dispose();

    protected abstract void handleInput();

}
