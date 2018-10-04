package com.example.entity;

import java.io.Serializable;

public class File implements Serializable {
    private String id;
    private Long size;
    private String name;
    private String path;

    public File() {
    }

    public File(String id, Long size, String name, String path) {
        this.id = id;
        this.size = size;
        this.name = name;
        this.path = path;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public Long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
