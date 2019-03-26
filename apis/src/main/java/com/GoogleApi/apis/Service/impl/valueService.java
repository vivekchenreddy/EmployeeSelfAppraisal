package com.GoogleApi.apis.Service.impl;

import com.GoogleApi.apis.Dto.ApiValues;
import com.GoogleApi.apis.repository.NoteRepository;
import com.GoogleApi.apis.repository.ValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.GoogleApi.apis.Dto.Weightage_code;


@Service
@Component
public class valueService {
    @Autowired
    Weightage_code obj;

    @Autowired
    ValueRepo obj1;

    public int sum(ApiValues value)
    {
        int mul=obj.getVB();
        int i=obj1.findOneByOption(value.inclusion);
        int m=obj1.findOneByOption(value.mettle);
        int p=obj1.findOneByOption(value.pioneering);
        int a=obj1.findOneByOption(value.accountability);
        int c=obj1.findOneByOption(value.collaboration);
        int t=obj1.findOneByOption(value.trust);
        int sum=i+m+p+a+c+t;

       // int sum=obj1.findOneByOption(apiValues.getAccountability())+obj1.findOneByOption(apiValues.getCollaboration())+obj1.findOneByOption(apiValues.getInclusion())+obj1.findOneByOption(apiValues.getMettle())+obj1.findOneByOption(apiValues.getPioneering())+obj1.findOneByOption(apiValues.getTrust());
        int val=(sum*100)/60;
        int sum1=(val*mul)/100;
        return val;
    }
}
