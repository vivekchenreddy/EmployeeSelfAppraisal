package com.GoogleApi.apis.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Component
@Table(name = "projectpillar2") 

public  class pillar2 {
    private String projectfields;
    private int score;

    public String getProjectfields() {
        return projectfields;
    }

    public void setProjectfields(String projectfields) {
        this.projectfields = projectfields;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
