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
}


