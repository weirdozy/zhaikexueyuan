package com.zhaike.entity;

public class Direction {
    private Integer id;

    private String directionname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectionname() {
        return directionname;
    }

    public void setDirectionname(String directionname) {
        this.directionname = directionname == null ? null : directionname.trim();
    }
}