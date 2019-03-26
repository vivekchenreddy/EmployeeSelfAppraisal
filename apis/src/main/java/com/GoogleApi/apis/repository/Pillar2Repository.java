package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.pillar2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Pillar2Repository extends JpaRepository<pillar2, Integer> {
    @Query(value = "SELECT score FROM projectpillar2 WHERE projectfields =?1", nativeQuery = true)
    public int findOneBypillar2(String pillar2);

}
