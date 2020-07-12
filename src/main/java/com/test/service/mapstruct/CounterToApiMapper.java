package com.test.service.mapstruct;

import com.test.service.ApiCounter;
import com.test.service.entity.Counter;

public interface CounterToApiMapper {

    ApiCounter toApiCounter(Counter counter);
}
