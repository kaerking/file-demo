package com.example.fileservice;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.FileInterface;
import com.example.fileservice.service.FileController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileServiceApplicationTests {
    @Reference
    FileInterface fileInterface;

    @Autowired
    FileController fileServiceReference;
    @Test
    public void contextLoads() {
        /*System.out.println("===============================");
        String a =fileInterface.get("aa").getName();
        System.out.println(a);*/
        System.out.println("==================================");
        String a =fileServiceReference.get("aa");
        System.out.println(a);
    }

}
