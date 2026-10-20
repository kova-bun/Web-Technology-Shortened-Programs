CREATE DATABASE IF NOT EXISTS batchc;

USE batchc;

CREATE TABLE IF NOT EXISTS users (
    username VARCHAR(50),
    password VARCHAR(50),
    email VARCHAR(100)
);
