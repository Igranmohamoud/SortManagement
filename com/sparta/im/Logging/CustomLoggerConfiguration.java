package com.sparta.im.Logging;

import com.sparta.im.sorters.BubbleSort;
import com.sparta.im.sorters.MergeSort;

import java.util.logging.Level;

public class CustomLoggerConfiguration {
    public static void ConfigureLogger() {
        BubbleSort.logger.addHandler(CustomFileHandler.getFileHandler());
        BubbleSort.logger.setUseParentHandlers(false);
        BubbleSort.logger.setLevel(Level.ALL);
        BubbleSort.logger.addHandler(CustomConsoleHandler.getConsoleHandler());

    }
}
