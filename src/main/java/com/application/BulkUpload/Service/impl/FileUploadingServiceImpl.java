package com.application.BulkUpload.Service.impl;

import com.application.BulkUpload.Service.FileUploadingService;
import com.application.BulkUpload.Utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.lang3.tuple.Pair;

@Service
public class FileUploadingServiceImpl implements FileUploadingService {
    @Autowired
    FileUploadUtils fileUploadUtils;
    @Override
    public String fileUploading(MultipartFile file) {
        Pair<Boolean , String> returnedPair = fileUploadUtils.storeFile(file);
        if (returnedPair.getLeft()){
            return "File Uploaded Successfully";
        }else{
            return returnedPair.getRight();
        }

    }
}
