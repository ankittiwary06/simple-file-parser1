package com.hicx;

import java.io.File;

public class DataSourceManager {
   private FileSource source;

    public DataSourceManager(FileSource source) {
        this.source = source;
    }

    public String getData(){
       return source.getData();
   }
}
