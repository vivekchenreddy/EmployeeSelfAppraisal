package com.GoogleApi.apis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.GoogleApi.apis.repository.Pillar1aRepository;

public class Pillar1aController {

    @Autowired
    Pillar1aController obj;
    @RequestBody

    @GetMapping("/pillar1a")
    public int setscore(@RequestBody String projectfields){


        return obj.findOneBypillar1a(projectfields);
    }

}
