package com.example.scheduler;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Process {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "process_id")
  private Integer processId;

  @Column(name = "process_name")
  private String processName;

  @Column(name = "process_start_time")
  private String processStartTime;
}