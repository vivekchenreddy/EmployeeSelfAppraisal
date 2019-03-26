package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/*
This repository has a method which searches the index and returns the desired column which
in turn is used in pillarController
 */
public interface PillarRepo extends JpaRepository<Pillar,String> {
    @Query(value = "SELECT SCORE FROM projectpillar2 WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar(String pillar);

}
