package com.example.scheduler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("processService")
public class ProcessService {

    @Autowired
    private ProcessRepository processRepository;

    public List<Process> findAll() {
        return processRepository.findAll();
    }

    public Process saveProcess(Process process) {
        return processRepository.save(process);
    }
}
