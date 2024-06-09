package com.hicx;

import java.io.File;

public interface FileManager {
    String PROCESSED_FOLDER="processed";
    String getFileData(String filepath);
    void processFile(String filePath);
}
