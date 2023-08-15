package com.example.scheduler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long> {
    // You can add custom query methods here if needed
}
