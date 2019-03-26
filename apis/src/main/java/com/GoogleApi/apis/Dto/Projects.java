package com.GoogleApi.apis.Dto;

import org.springframework.stereotype.Component;
/*
This is another DTO wic is used to initialize the ProjectName,Score,Time,Rating,TotalScore for the further calculation
of the project main page.Here the rating is retrieved form the database.
 */
@Component
public class Projects
{
    public int ProjectName;
    public int Score;
    public int Time;
    public int Rating;
    public int TotalScore;

    public int getProjectName() {
        return ProjectName;
    }

    public void setProjectName(int projectName) {
        ProjectName = projectName;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getTotalScore() {
        return TotalScore;
    }

    public void setTotalScore(int totalScore) {
        TotalScore = totalScore;
    }
}
