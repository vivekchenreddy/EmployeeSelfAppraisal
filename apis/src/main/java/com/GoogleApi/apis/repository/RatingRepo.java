package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RatingRepo extends JpaRepository<Rating,String>
{
    @Query(value = "SELECT RATING FROM RATING_TABLE WHERE PROJECT =?1", nativeQuery = true)
    public int findOneByRating(String project);
}
