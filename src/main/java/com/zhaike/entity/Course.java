package com.zhaike.entity;

import java.util.Date;
import java.util.List;

public class Course {
    private Integer id;

    private Integer directionid;

    private Integer classifyid;

    private Date raleasetime;

    private Integer viewcount;

    private String coursecover;

    private String validday;

    private Integer lecturerid;

    private String describe;

    private String free;

    private Double price;


//    章节
    private List<Chapter> chapters;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", directionid=" + directionid +
                ", classifyid=" + classifyid +
                ", raleasetime=" + raleasetime +
                ", viewcount=" + viewcount +
                ", coursecover='" + coursecover + '\'' +
                ", validday='" + validday + '\'' +
                ", lecturerid=" + lecturerid +
                ", describe='" + describe + '\'' +
                ", free='" + free + '\'' +
                ", price=" + price +
                ", chapters=" + chapters +
                '}';
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public Integer getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(Integer classifyid) {
        this.classifyid = classifyid;
    }

    public Date getRaleasetime() {
        return raleasetime;
    }

    public void setRaleasetime(Date raleasetime) {
        this.raleasetime = raleasetime;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public String getCoursecover() {
        return coursecover;
    }

    public void setCoursecover(String coursecover) {
        this.coursecover = coursecover == null ? null : coursecover.trim();
    }

    public String getValidday() {
        return validday;
    }

    public void setValidday(String validday) {
        this.validday = validday == null ? null : validday.trim();
    }

    public Integer getLecturerid() {
        return lecturerid;
    }

    public void setLecturerid(Integer lecturerid) {
        this.lecturerid = lecturerid;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}