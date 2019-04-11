package com.example.mohammedthabet.realmadrid;

public class Match {

    String awayTeamName;
    String homeTeamName;
    String date;
    String competitionName;

    public Match(String competitionName, String homeTeamName, String awayTeamName, String date) {
        this.awayTeamName = awayTeamName;
        this.homeTeamName = homeTeamName;
        this.date = date;
        this.competitionName = competitionName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
}
