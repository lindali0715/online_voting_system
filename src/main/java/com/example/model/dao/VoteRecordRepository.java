package com.example.model.dao;

import com.example.model.entity.VoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRecordRepository extends JpaRepository<VoteRecord, Integer> {

    List<VoteRecord> findAll();

    @Query(value = "CALL get_name(:name_in);", nativeQuery = true)
    VoteRecord getById(@Param("name_in") Integer name_in);

}
