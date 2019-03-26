package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SigninRepository extends JpaRepository<Note,Long> {



}
