package com.GoogleApi.apis.Service.impl;

import com.GoogleApi.apis.Dto.Projects;
import com.GoogleApi.apis.Service.ProjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ProjImpl implements ProjService {
    @Autowired
    Projects obj1;



    public int set_code(String c)
    {

        //obj.setCode(b);

        if (c.equals("Astro"))
        {
            obj1.setRating(82);

        }
        else if (c.equals("Darwin"))
        {
            obj1.setRating(76);

        }
        else if (c.equals("Elixir"))
        {
            obj1.setRating(85);

        }
        return obj1.getRating();

    }


}
