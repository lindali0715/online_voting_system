package com.example.service;

import com.example.model.entity.VoteRecord;

import java.util.List;

public interface VoteRecordService {
    VoteRecord createVote(VoteRecord voteRecord);
    List<VoteRecord> readVote();
    VoteRecord readById(Integer nameId);
    void deleteById(Integer nameId);
    VoteRecord updateById(Integer nameId,VoteRecord voteRecord);
}
