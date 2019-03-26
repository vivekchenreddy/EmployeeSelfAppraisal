package com.GoogleApi.apis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Component
@Table(name = "IMPACT_VALUES")


public class Impact {
    @Id
    @NotNull
    private String impact;
    private int SCORE;

    public int getSCORE() {
        return SCORE;
    }

    public void setSCORE(int SCORE) {
        this.SCORE = SCORE;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @NotNull
    private int value;

}

