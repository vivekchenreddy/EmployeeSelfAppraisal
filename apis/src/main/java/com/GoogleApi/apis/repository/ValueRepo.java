package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.IMPACT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepo extends JpaRepository<IMPACT,Integer>
{
    @Query(value = "SELECT SCORE FROM IMPACT_VALUES WHERE IMPACT =?1", nativeQuery = true)
    public int findOneByOption(String impact);
}
