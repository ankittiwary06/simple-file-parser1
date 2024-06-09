package com.hicx;

public class FileSource extends Source {
    private FileManager fileManager;
    private String path;

    public FileSource(FileManager fileManager, String path) {
        super();
        this.fileManager = fileManager;
        this.path = path;
    }

    public String getData()
    {
       return fileManager.getFileData(path);
    }
}
