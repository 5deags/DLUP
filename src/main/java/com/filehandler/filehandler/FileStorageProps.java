package com.filehandler.filehandler;

//package com.example.filedemo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProps {
    private String uploadDirectory;

    public String getUploadDir() {
        return uploadDirectory;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDirectory = uploadDir;
    }
}
