package com.zhaike.controller;

import com.zhaike.entity.Carousel;
import com.zhaike.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/carousel")
public class CarouselController {

    @Autowired
    private CarouselService service;

    @CrossOrigin(origins = "*")
    @RequestMapping("/all")
    @ResponseBody
    public List<Carousel> selectAll(){

        return service.selectAll();
    }


}
