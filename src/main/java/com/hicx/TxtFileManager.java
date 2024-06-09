package com.hicx;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TxtFileManager implements FileManager{

    private File file;
    private String path;
    private File processedFile;
    @Override
    public String getFileData(String filePath) {
        Path path = Paths.get(filePath);
        String content = null;
        try {
            content = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }

    @Override
    public void processFile(String filePath) {

    }
}
