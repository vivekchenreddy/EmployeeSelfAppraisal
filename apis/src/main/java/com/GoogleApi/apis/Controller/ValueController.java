package com.GoogleApi.apis.Controller;

import com.GoogleApi.apis.Dto.ApiValues;
import com.GoogleApi.apis.repository.ValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
The method which takes the IMPACT values from the dropdown database and calculates the IMPACT score
Additionally to make it a restful api it is made RestController that is a rest controller takes the requests like
POST,PUT,GET through http request. */

@RestController
public class ValueController
{
    @Autowired
    com.GoogleApi.apis.Service.impl.valueService val;

    @Autowired
    ValueRepo obj;

    @CrossOrigin
    @ResponseBody
    @PostMapping(value = "/values")
    public int getValues(@RequestBody ApiValues value)


    {


        return val.sum(value);
    }

}
