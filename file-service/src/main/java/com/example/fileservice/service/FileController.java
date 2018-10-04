package com.example.fileservice.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.FileInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileController {
    @Reference
    FileInterface fileInterface;
    @RequestMapping(method =RequestMethod.GET)
    public String get(String id){
        return fileInterface.get(id).toString();
    }


}
