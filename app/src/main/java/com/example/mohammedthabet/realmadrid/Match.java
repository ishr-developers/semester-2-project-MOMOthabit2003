package com.example.mohammedthabet.realmadrid;

public class Match {

    String awayTeamName;
    String homeTeamName;
    String date;
    String competitionName;
    String venueName;
    String utcTime;

    public Match() {
    }

    public Match(String competitionName, String homeTeamName, String awayTeamName, String date, String venue, String time) {
        this.awayTeamName = awayTeamName;
        this.homeTeamName = homeTeamName;
        this.date = date;
        this.competitionName = competitionName;
        this.venueName = venue;
        this.utcTime = time;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
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
