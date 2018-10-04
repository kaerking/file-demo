package com.example.serviceSupport.filedubboservice;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.FileInterface;
import com.example.dao.FileMapper;
import com.example.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Service(interfaceClass = FileInterface.class)
@Component
public class FileServiceSupport implements FileInterface {
    @Autowired
    FileMapper fileMapper;

    @Cacheable(value = {"file"})
    @Override
    public File get(String id) {
        return fileMapper.get(id);
    }
}
