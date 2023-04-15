package com.example.service;

import com.example.model.entity.VoteProject;

import java.util.List;

public interface VoteProjectService {
    VoteProject createProject(VoteProject voteProject);
    List<VoteProject> readProject();
    VoteProject readById(Integer voteId);
    void deleteById(Integer voteId);
    VoteProject updateById(Integer voteId,VoteProject voteProject);
}
