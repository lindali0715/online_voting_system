package com.example.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vote_record")
public class VoteRecord {
    @Id
    @Column(name = "name_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nameId;

    @Column(name = "name")
    private String name;

    @Column(name = "vote_id")
    private Integer voteId;

    public VoteRecord() {
    }

    public VoteRecord(Integer nameId, String name, Integer voteId) {
        this.nameId = nameId;
        this.name = name;
        this.voteId = voteId;
    }

    public Integer getNameId() {
        return nameId;
    }

    public void setNameId(Integer nameId) {
        this.nameId = nameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    @Override
    public String toString() {
        return "VoteRecord{" +
                "nameId=" + nameId +
                ", name='" + name + '\'' +
                ", voteId=" + voteId +
                '}';
    }
}

