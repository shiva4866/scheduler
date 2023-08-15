package com.example.scheduler;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProcessService {
    private final ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    public List<Process> findAll() {
        return processRepository.findAll();
    }

    public Process saveProcess(Process process) {
        return processRepository.save(process);
    }
}
