package com.zhaike.entity;

public class Carousel {
    private Integer id;

    private String carouselurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarouselurl() {
        return carouselurl;
    }

    public void setCarouselurl(String carouselurl) {
        this.carouselurl = carouselurl == null ? null : carouselurl.trim();
    }
}