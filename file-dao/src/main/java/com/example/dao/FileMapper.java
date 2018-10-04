package com.example.dao;

import com.example.entity.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FileMapper {
    @Select("SELECT * FROM t_file WHERE id =#{id}")
    public File get(String id);
}
