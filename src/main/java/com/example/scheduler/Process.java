package com.example.scheduler;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "process")
public class Process {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(columnDefinition = "process_id")
  private Long processId;

  @Column(columnDefinition = "process_name")
  private String processName;

  @Column(columnDefinition = "process_start_time")
  private LocalDateTime processStartTime;
}
