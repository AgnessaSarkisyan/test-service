package com.test.service.mapstruct.impl;

import com.test.service.ApiCounter;
import com.test.service.entity.Counter;
import com.test.service.mapstruct.CounterToApiMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class MapStructCounterToApiMapper implements CounterToApiMapper {

    @Override
    @Mappings({
            @Mapping(target = "value", source = "value")
    })
    public abstract ApiCounter toApiCounter(Counter counter);
}
