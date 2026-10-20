CREATE DATABASE IF NOT EXISTS student;

USE student;

CREATE TABLE IF NOT EXISTS employee (
    rollno INT PRIMARY KEY,
    studentname VARCHAR(50),
    course VARCHAR(50),
    mobileno VARCHAR(12)
);
