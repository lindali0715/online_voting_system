package com.example.controller;

import com.example.model.entity.VoteProject;
import com.example.service.VoteProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VoteProjectController {
    @Autowired
    private VoteProjectService voteProjectService;

    //前台投票項目系統展示
    @GetMapping("/front_vote.html")
    public String getProject(Model model){
        model.addAttribute("project", voteProjectService.readProject());
        return "front_vote";
    }

    //後台投票項目列表
    @GetMapping("/admin_vote.html")
    public String getAllProject(Model model){
        model.addAttribute("project1", voteProjectService.readProject());
        return "admin_vote";
    }

    //後台新增投票項目
    @PostMapping("/addProject")
    public String addProject(VoteProject voteProject){
        voteProjectService.createProject(voteProject);
        return "redirect:/admin_vote.html";
    }

    //後台刪除投票項目
    @RequestMapping("/deleteProject/{voteId}")
    public String deleteProject(@PathVariable Integer voteId){
        voteProjectService.deleteById(voteId);
        return "redirect:/admin_vote.html";
    }
}
