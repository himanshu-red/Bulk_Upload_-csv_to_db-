package com.application.BulkUpload.Service.impl;

import com.application.BulkUpload.Repository.DeliveriesRepo;
import com.application.BulkUpload.Service.FileUploadingService;
import com.application.BulkUpload.Utils.FileUploadUtils;
import com.application.BulkUpload.config.ApplicationConfig;
import com.application.BulkUpload.entity.Delivery;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

import java.io.*;

@Service
public class FileUploadingServiceImpl implements FileUploadingService {
    @Autowired
    FileUploadUtils fileUploadUtils;
    @Autowired
    ApplicationConfig applicationConfig;
    @Autowired
    DeliveriesRepo deliveriesRepo;
    @Override
    public String fileUploading(MultipartFile file) {
        Pair<Boolean , String> returnedPair = fileUploadUtils.storeFile(file);
        if (returnedPair.getLeft()){
            try(Reader reader = new FileReader(applicationConfig.getUploadDirectory() + File.separator + returnedPair.getRight())){
                CsvToBean<Delivery> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(Delivery.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .withFieldAsNull(CSVReaderNullFieldIndicator.BOTH)
                        .build();
                List<Delivery> deliveryList = csvToBean.parse();
                System.out.println("Size of list : "  + deliveryList);
                deliveriesRepo.saveAll(deliveryList);
            } catch (FileNotFoundException e) {
                throw new RuntimeException("File Not found. " + e);
            } catch (IOException e) {
                throw new RuntimeException("Error Occured while reading and writting the file." + e);
            }
            System.out.println(returnedPair.getRight());
            return "File Uploaded Successfully";
        }else{
            return returnedPair.getRight();
        }

    }
}
