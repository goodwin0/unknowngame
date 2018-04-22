package com.unknowngame.services.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.unknowngame.services.FileService;
import com.unknowngame.utils.Consts;

public class FileServiceImpl implements FileService {

    /**
     *
     * @param fileName путьдо файла вкючая название, без указания формата файла
     * @return
     */
    @Override
    public FileHandle findTexture(String fileName) {
        return Gdx.files.internal(fileName + Consts.PNG_FORMAT);
    }
}
