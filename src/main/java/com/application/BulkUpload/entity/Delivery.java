package com.application.BulkUpload.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @CsvBindByName(column = "match_id")
    private long match_id;
    @CsvBindByName(column = "inning")
    private int inning;
    @CsvBindByName(column = "batting_team")
    private String battingTeam;
    @CsvBindByName(column = "bowling_team")
    private String bowlingTeam;
    @CsvBindByName(column = "over")
    private int over;
    @CsvBindByName(column = "ball")
    private int ball;
    @CsvBindByName(column = "batsman")
    private String batsman;
    @CsvBindByName(column = "non_striker")
    private String nonStriker;
    @CsvBindByName(column = "bowler")
    private String bowler;
    @CsvBindByName(column = "is_super_over")
    private boolean isSuperOver;
    @CsvBindByName(column = "wide_runs")
    private int wideRuns;
    @CsvBindByName(column = "bye_runs")
    private int byeRuns;
    @CsvBindByName(column = "legby_runs")
    private int legbyRuns;
    @CsvBindByName(column = "noball_runs")
    private int noballRuns;
    @CsvBindByName(column = "penalty_runs")
    private int penaltyRuns;
    @CsvBindByName(column = "batsman_runs")
    private int batsmanRuns;
    @CsvBindByName(column = "extra_runs")
    private int extraRuns;
    @CsvBindByName(column = "total_runs")
    private int totalRuns;
    @CsvBindByName(column = "player_dismissed")
    private String playerDismissed;
    @CsvBindByName(column = "dismissal_kind")
    private String dismissalKind;
    @CsvBindByName(column = "fielder")
    private String fielder;
}


