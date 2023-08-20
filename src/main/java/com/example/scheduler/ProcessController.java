package com.example.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/process")
public class ProcessController {

  @Autowired
  private ProcessService processService;

  @GetMapping
  public ResponseEntity<List<Process>> getProcesses() {
    return ResponseEntity.ok(processService.findAll());
  }

  @PostMapping
  public ResponseEntity<String> createProcess(@RequestBody Process process) {
    processService.saveProcess(process);
    return ResponseEntity.ok("Process Created");
  }
}
