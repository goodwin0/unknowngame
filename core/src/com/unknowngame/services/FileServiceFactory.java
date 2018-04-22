package com.unknowngame.services;

import com.unknowngame.services.impl.FileServiceImpl;

public abstract class FileServiceFactory {
   private static FileService fileService = new FileServiceImpl();

    public static FileService getFileService(){
        return fileService;
    }
}
