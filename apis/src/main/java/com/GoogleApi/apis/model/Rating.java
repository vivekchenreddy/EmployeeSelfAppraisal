package com.GoogleApi.apis.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Component
@Table(name="rating_table")
public class Rating
{
    @Id
    public String Proj;
    public int score;

    public String getProj() {
        return Proj;
    }

    public void setProj(String proj) {
        Proj = proj;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
