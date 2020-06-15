package com.zhaike.entity;

public class Chapter {
    private Integer id;

    private String chapter;

    private String section;

    private Integer courseid;

    private String videourl;

    private String videoicon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getVideoicon() {
        return videoicon;
    }

    public void setVideoicon(String videoicon) {
        this.videoicon = videoicon == null ? null : videoicon.trim();
    }
}