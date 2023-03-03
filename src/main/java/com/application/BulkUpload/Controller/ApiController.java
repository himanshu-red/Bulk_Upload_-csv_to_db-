package com.application.BulkUpload.Controller;

import com.application.BulkUpload.Service.FileUploadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {


    @Autowired
    FileUploadingService uploadService;
    @PostMapping("/upload")
    public String uploadCsv(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()){
            return "File Empty";
        }else{
            uploadService.fileUploading(file);
            return "Uploading file";
        }
    }
}
