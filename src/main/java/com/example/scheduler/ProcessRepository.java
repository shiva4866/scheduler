package com.example.scheduler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("processRepository")
public interface ProcessRepository extends JpaRepository<Process, Integer> {
}
