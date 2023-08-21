CREATE DATABASE scheduler;
USE scheduler;

CREATE TABLE process (
    process_id INT NOT NULL PRIMARY KEY,
    process_name VARCHAR(255),
    process_start_time VARCHAR(255)
);

INSERT INTO process (process_name, process_id, process_start_time)
VALUES
    ('Hello, World', 100, '2023-08-15 00:00:00'),
    ('Process 1', 101, '2023-08-15 00:00:00'),
    ('Process 2', 102, '2023-08-15 01:00:00'),
    ('Process 3', 103, '2023-08-15 02:00:00'),
    ('Process 4', 104, '2023-08-15 03:00:00'),
    ('Process 23', 123, '2023-08-15 22:00:00'),
    ('Process 24', 124, '2023-08-15 23:00:00');
