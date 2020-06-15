package com.zhaike.service.impl;

import com.zhaike.entity.Carousel;
import com.zhaike.entity.CarouselExample;
import com.zhaike.mapping.CarouselMapper;
import com.zhaike.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper mapper;

    @Override
    public List<Carousel> selectAll() {
        CarouselExample carouselExample = new CarouselExample();
        carouselExample.createCriteria().getAllCriteria();
        return mapper.selectByExample(carouselExample);
    }
}
