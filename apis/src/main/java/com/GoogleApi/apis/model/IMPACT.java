package com.GoogleApi.apis.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*

 */
@Entity
@Component
@Table(name="IMPACT_VALUES")
public class IMPACT
{
    @Id
    @NotNull
   public String value;
    public int score;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
