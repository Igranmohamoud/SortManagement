package com.sparta.im.Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class CustomFileHandler{
    public static FileHandler getFileHandler() {
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/my-log.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            return fileHandler;

        } catch (IOException e)  {
            e.printStackTrace();
        }
        return null;
    }
}
