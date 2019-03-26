package com.GoogleApi.apis.Controller;

import com.GoogleApi.apis.Service.impl.apiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class CodeController

/*
This is the controller used to change the weightage code according to the position of the employee in the organisation.
The /code redirects from the frontend to this api so the the weightage code can be selected.
 */

{
    @Autowired
    apiImpl impl;

    @GetMapping("/code")
    public int setCode(@RequestParam String code)
    {
        return impl.set_code(code);


    }

}
