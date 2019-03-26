package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.pillar1a;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Pillar1aRepository extends JpaRepository<pillar1a, Integer> {
    @Query(value = "SELECT score FROM projectpillar1a WHERE projectfields =?1", nativeQuery = true)
    public int findOneBypillar1a(String pillar1a);

}
