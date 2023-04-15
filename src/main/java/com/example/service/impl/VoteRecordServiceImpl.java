package com.example.service.impl;

import com.example.model.dao.VoteRecordRepository;
import com.example.model.entity.VoteRecord;
import com.example.service.VoteRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteRecordServiceImpl implements VoteRecordService {
    @Autowired
    private VoteRecordRepository voteRecordRepository;
    @Override
    public VoteRecord createVote(VoteRecord voteRecord) {
        return voteRecordRepository.save(voteRecord);
    }

    @Override
    public List<VoteRecord> readVote() {
        return voteRecordRepository.findAll();
    }

    @Override
    public VoteRecord readById(Integer nameId) {
        return voteRecordRepository.getById(nameId);
    }

    @Override
    public void deleteById(Integer nameId) {
        voteRecordRepository.deleteById(nameId);
    }

    @Override
    public VoteRecord updateById(Integer nameId, VoteRecord voteRecord) {
        VoteRecord voteRecord1 = voteRecordRepository.findById(nameId).get();
        if(voteRecord1 != null){
            voteRecord1.setNameId(nameId);
            voteRecord1.setName(voteRecord.getName());
            voteRecord1.setVoteId(voteRecord.getVoteId());
        }
        return voteRecordRepository.save(voteRecord1);
    }
}
