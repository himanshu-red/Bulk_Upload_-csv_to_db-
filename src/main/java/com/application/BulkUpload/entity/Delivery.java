package com.application.BulkUpload.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int inning;
    private String battingTeam;
    private String bowlingTeam;
    private int over;
    private int ball;
    private String batsman;
    private String non_striker;
    private String bowler;
    private boolean isSuperOver;
    private int wideRuns;
    private int byeRuns;
    private int legbyRuns;
    private int noballRuns;
    private int penaltyRuns;
    private int batsmanRuns;
    private int extraRuns;
    private int totalRuns;
    private String playerDismissed;
    private String dismissalKind;
    private String fielder;

    public Delivery(long id, int inning, String battingTeam, String bowlingTeam, int over, int ball, String batsman, String non_striker, String bowler, boolean isSuperOver, int wideRuns, int byeRuns, int legbyRuns, int noballRuns, int penaltyRuns, int batsmanRuns, int extraRuns, int totalRuns, String playerDismissed, String dismissalKind, String fielder) {
        this.id = id;
        this.inning = inning;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.non_striker = non_striker;
        this.bowler = bowler;
        this.isSuperOver = isSuperOver;
        this.wideRuns = wideRuns;
        this.byeRuns = byeRuns;
        this.legbyRuns = legbyRuns;
        this.noballRuns = noballRuns;
        this.penaltyRuns = penaltyRuns;
        this.batsmanRuns = batsmanRuns;
        this.extraRuns = extraRuns;
        this.totalRuns = totalRuns;
        this.playerDismissed = playerDismissed;
        this.dismissalKind = dismissalKind;
        this.fielder = fielder;
    }

    public Delivery() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getNon_striker() {
        return non_striker;
    }

    public void setNon_striker(String non_striker) {
        this.non_striker = non_striker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public boolean isSuperOver() {
        return isSuperOver;
    }

    public void setSuperOver(boolean superOver) {
        isSuperOver = superOver;
    }

    public int getWideRuns() {
        return wideRuns;
    }

    public void setWideRuns(int wideRuns) {
        this.wideRuns = wideRuns;
    }

    public int getByeRuns() {
        return byeRuns;
    }

    public void setByeRuns(int byeRuns) {
        this.byeRuns = byeRuns;
    }

    public int getLegbyRuns() {
        return legbyRuns;
    }

    public void setLegbyRuns(int legbyRuns) {
        this.legbyRuns = legbyRuns;
    }

    public int getNoballRuns() {
        return noballRuns;
    }

    public void setNoballRuns(int noballRuns) {
        this.noballRuns = noballRuns;
    }

    public int getPenaltyRuns() {
        return penaltyRuns;
    }

    public void setPenaltyRuns(int penaltyRuns) {
        this.penaltyRuns = penaltyRuns;
    }

    public int getBatsmanRuns() {
        return batsmanRuns;
    }

    public void setBatsmanRuns(int batsmanRuns) {
        this.batsmanRuns = batsmanRuns;
    }

    public int getExtraRuns() {
        return extraRuns;
    }

    public void setExtraRuns(int extraRuns) {
        this.extraRuns = extraRuns;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getPlayerDismissed() {
        return playerDismissed;
    }

    public void setPlayerDismissed(String playerDismissed) {
        this.playerDismissed = playerDismissed;
    }

    public String getDismissalKind() {
        return dismissalKind;
    }

    public void setDismissalKind(String dismissalKind) {
        this.dismissalKind = dismissalKind;
    }

    public String getFielder() {
        return fielder;
    }

    public void setFielder(String fielder) {
        this.fielder = fielder;
    }
}


