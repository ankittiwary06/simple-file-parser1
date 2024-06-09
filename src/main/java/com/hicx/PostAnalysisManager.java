package com.hicx;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PostAnalysisManager {
   public Boolean process(String path,String result)
    {
        Path filePath=Paths.get(path);
        String targetPath = filePath.getParent()+"processed"+filePath.getFileName();

        try {
            Files.write(Paths.get(targetPath), result.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
       return true;
    }

}
