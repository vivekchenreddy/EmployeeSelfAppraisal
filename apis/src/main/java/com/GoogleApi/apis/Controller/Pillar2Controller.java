package com.GoogleApi.apis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Pillar2Controller {

    @Autowired


    @GetMapping("/pillar2")
    public int setscore(@RequestBody String projectfields){


        return setscore(projectfields);
    }

}
