package com.example.service.impl;

import com.example.model.dao.VoteProjectRepository;
import com.example.model.entity.VoteProject;
import com.example.service.VoteProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteProjectServiceImpl implements VoteProjectService {
    @Autowired
    private VoteProjectRepository voteProjectRepository;
    @Override
    public VoteProject createProject(VoteProject voteProject) {
        VoteProject voteProject1 = new VoteProject();
        voteProject1.setVoteName(voteProject.getVoteName());
        voteProject1.setVoteTime(0);
        return voteProjectRepository.save(voteProject1);
    }

    @Override
    public List<VoteProject> readProject() {
        return voteProjectRepository.findAll();
    }

    @Override
    public VoteProject readById(Integer voteId) {
        return voteProjectRepository.getProjectById(voteId);
    }

    @Override
    public void deleteById(Integer voteId) {
        voteProjectRepository.deleteById(voteId);
    }

    @Override
    public VoteProject updateById(Integer voteId, VoteProject voteProject) {
        VoteProject voteProject1 = voteProjectRepository.findById(voteId).get();
        if(voteProject1 != null){
            voteProject1.setVoteId(voteId);
            voteProject1.setVoteName(voteProject.getVoteName());
            voteProject1.setVoteTime(voteProject.getVoteTime());
        }
        return voteProjectRepository.save(voteProject1);
    }
}
