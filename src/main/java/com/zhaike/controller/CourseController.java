package com.zhaike.controller;

import com.zhaike.entity.Course;
import com.zhaike.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService service;

    @CrossOrigin(origins = "*")
    @RequestMapping("/all")
    @ResponseBody
    public List<Course> selectAll(){
        return service.selectAll();
    }
}
