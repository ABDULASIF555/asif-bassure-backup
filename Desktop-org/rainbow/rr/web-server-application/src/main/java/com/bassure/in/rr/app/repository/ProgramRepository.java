package com.bassure.in.rr.app.repository;

import com.bassure.in.rr.app.model.program.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Integer>{
    
}
