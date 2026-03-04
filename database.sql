
CREATE DATABASE college_db;

USE college_db;

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    password VARCHAR(50)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100)
);

CREATE TABLE admissions (
    application_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_id INT,
    status VARCHAR(50)
);
