package com.example.controller;

import com.example.model.dao.VoteProjectRepository;
import com.example.model.entity.VoteRecord;
import com.example.service.VoteRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoteRecordController {
    @Autowired
    private VoteRecordService voteRecordService;

    @Autowired
    private VoteProjectRepository voteProjectRepository;

    //前台新增投票
    @PostMapping("/addVote")
    public String addVote(VoteRecord voteRecord){
//        VoteProject voteProject = voteProjectRepository.findById(voteId).orElseThrow(() -> new RuntimeException("投票項目不存在"));
//        voteProject.setVoteTime(voteProject.getVoteTime + 1);
//        voteProjectRepository.save(voteProject);

        VoteRecord voteRecord1 = new VoteRecord();
        voteRecord1.setName(voteRecord.getName());
        voteRecord1.setVoteId(2);
        voteRecordService.createVote(voteRecord1);
        return "redirect:/front_vote.html";
    }

}
