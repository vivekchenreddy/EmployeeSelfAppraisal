package com.GoogleApi.apis.Controller;

import com.GoogleApi.apis.Service.impl.ProjImpl;
import com.GoogleApi.apis.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*

 */
@RestController

public class ProjectController {

    @Autowired
    RatingRepo obj;

    @ResponseBody
    @GetMapping("/proj")
    public int setCode(@RequestParam String proj)
    {

        return obj.findOneByRating(proj);

    }

}
