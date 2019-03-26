package com.GoogleApi.apis.Dto;

import org.springframework.stereotype.Component;
/*
This is a component as mentioned in the @Component  for the Valuecontroller.This
is a DTO which is used to take the corresponding dropdown value
 */
@Component
public class ApiValues {
    public String inclusion;
    public String mettle;
    public String pioneering;
    public String accountability;
    public String collaboration;
    public String trust;

    public String getInclusion() {
        return inclusion;
    }

    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }

    public String getMettle() {
        return mettle;
    }

    public void setMettle(String mettle) {
        this.mettle = mettle;
    }

    public String getPioneering() {
        return pioneering;
    }

    public void setPioneering(String pioneering) {
        this.pioneering = pioneering;
    }

    public String getAccountability() {
        return accountability;
    }

    public void setAccountability(String accountability) {
        this.accountability = accountability;
    }

    public String getCollaboration() {
        return collaboration;
    }

    public void setCollaboration(String collaboration) {
        this.collaboration = collaboration;
    }

    public String getTrust() {
        return trust;
    }

    public void setTrust(String trust) {
        this.trust = trust;
    }
}
