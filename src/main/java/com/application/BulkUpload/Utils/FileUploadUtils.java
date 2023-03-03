package com.application.BulkUpload.Utils;

import com.application.BulkUpload.config.ApplicationConfig;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadUtils {
    @Autowired
    ApplicationConfig applicationConfig;
    private static Path fileStorageLocation;
    @PostConstruct
    private void setPath(){
        fileStorageLocation = Paths.get(applicationConfig.getUploadDirectory());
    }

    public Pair<Boolean, String> storeFile(MultipartFile file){
        String fileName = file.getOriginalFilename();
        assert fileName != null;
        if (fileName.endsWith(".csv")){
            fileName = fileName.substring(0, fileName.indexOf("."));
            try(InputStream inputStream = file.getInputStream()){
                Files.copy(inputStream, fileStorageLocation.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
                return Pair.of(true, "File Uploaded");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            return Pair.of(false, "Invalid Filetype");
        }
    }
}
