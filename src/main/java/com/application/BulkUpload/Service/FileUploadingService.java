package com.application.BulkUpload.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadingService {
    public String fileUploading(MultipartFile file);
}
