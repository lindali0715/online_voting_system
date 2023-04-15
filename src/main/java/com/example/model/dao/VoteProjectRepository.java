package com.example.model.dao;

import com.example.model.entity.VoteProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteProjectRepository extends JpaRepository<VoteProject, Integer> {

    List<VoteProject> findAll();

    @Query(value = "CALL get_project(:vote_in);", nativeQuery = true)
    VoteProject getById(@Param("vote_in") Integer vote_in);

    @Query(value = "select * from vote_project where vote_id = ?", nativeQuery = true)
    VoteProject getProjectById(Integer voteId);

}
