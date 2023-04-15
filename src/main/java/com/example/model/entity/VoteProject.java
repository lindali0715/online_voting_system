package com.example.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vote_project")
public class VoteProject {
    @Id
    @Column(name = "vote_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voteId;

    @Column(name = "vote_name")
    private String voteName;

    @Column(name = "vote_time")
    private Integer voteTime;

    public VoteProject() {
    }

    public VoteProject(Integer voteId, String voteName, Integer voteTime) {
        this.voteId = voteId;
        this.voteName = voteName;
        this.voteTime = voteTime;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public Integer getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(Integer voteTime) {
        this.voteTime = voteTime;
    }

    @Override
    public String toString() {
        return "VoteProject{" +
                "voteId=" + voteId +
                ", voteName='" + voteName + '\'' +
                ", voteTime=" + voteTime +
                '}';
    }
}

