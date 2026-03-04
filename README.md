College Admission System (Console Based Java Project)
Project Title

College Admission Process Management System

Developed By

Name: Aman Shrivastav
Course: MCA 
College: D. Y. Patil Institute of Management and Entrepreneur Development

Project Description

The College Admission System is a console-based Java application designed to manage the college admission process. The system allows students to register, log in, view available courses, and apply for admission. The admin can manage courses and view student applications.

This project demonstrates the use of Core Java concepts such as classes, objects, methods, and basic database connectivity.

Technologies Used

Java (Core Java)

MySQL Database

JDBC Connectivity

Console Based Interface

Project Modules
1. Student Registration

Students can create an account by entering their personal details.

Details collected:

Name

Email

Phone Number

Password

2. Student Login

Registered students can log in to the system using their email and password.

After login students can:

View available courses

Apply for a course

Check admission status

3. Course Management

Admin can manage courses available for admission.

Example courses:

BCA

BBA

MCA

MBA

4. Admission Application

Students can apply for admission by selecting a course.

Application status can be:

Pending

Approved

Rejected

5. Admin Panel

Admin can log in to the system and perform administrative tasks.

Admin features:

View registered students

View admission applications

Add new courses

Database Structure
Students Table
student_id
name
email
phone
password
Courses Table
course_id
course_name
Admissions Table
application_id
student_id
course_id
status
Project File Structure
CollegeAdmissionSystem
│
├── Main.java
├── Student.java
├── Admin.java
├── Course.java
├── Admission.java
├── DBConnection.java
├── database.sql
└── README.md
How to Run the Project

Install Java JDK

Install MySQL Server

Create database using database.sql

Open the project in NetBeans / Eclipse / VS Code

Run Main.java

Sample Console Menu
===== COLLEGE ADMISSION SYSTEM =====

1. Student Registration
2. Student Login
3. Admin Login
4. Exit
Future Improvements

Online fee payment

Merit list generation

Student document upload

GUI version using Java Swing

Web-based admission system
