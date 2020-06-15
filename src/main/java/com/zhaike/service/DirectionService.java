package com.zhaike.service;

import com.zhaike.entity.Direction;
import com.zhaike.entity.DirectionExample;

import java.util.List;

public interface DirectionService {
    List<Direction> getAll(DirectionExample example);
}
