package com.zhaike.controller;

import com.zhaike.entity.Direction;
import com.zhaike.entity.DirectionExample;
import com.zhaike.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/direction")
public class DirectionController {
    @Autowired
    private DirectionService directionService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/all")
    @ResponseBody
    public List<Direction> getAll(){
        DirectionExample directionExample = new DirectionExample();
        directionExample.createCriteria().getAllCriteria();
        return directionService.getAll(directionExample);
    }
}
