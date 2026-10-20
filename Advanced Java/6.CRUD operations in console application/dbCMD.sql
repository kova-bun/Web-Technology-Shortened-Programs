CREATE DATABASE IF NOT EXISTS studentdb;

USE studentdb;

CREATE TABLE IF NOT EXISTS student (
    rollno INT PRIMARY KEY,
    studentname VARCHAR(50),
    course VARCHAR(50),
    mobileno VARCHAR(12)
);
