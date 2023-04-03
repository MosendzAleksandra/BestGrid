-- MySQL Workbench Forward Engineering
CREATE DATABASE if not exists bestgrid;
USE bestgrid;

-- Адреса
CREATE TABLE if not exists bestgrid.address(
  addressID INT NOT NULL,                          
  country VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  street VARCHAR(50) NOT NULL,
  house int NOT NULL,
  PRIMARY KEY (addressID)
  );

-- School
CREATE TABLE if not exists bestgrid.school(
  schoolID INT NOT NULL,                          
  addressID INT NULL,
  phone VARCHAR(50) NULL,
  PRIMARY KEY (schoolID),
  FOREIGN KEY (addressID)
    REFERENCES bestgrid.address (addressID)
	ON DELETE CASCADE
    ON UPDATE CASCADE
  );
  
  -- Четверть
CREATE TABLE if not exists bestgrid.quarter(
  quarterID INT NOT NULL,                          
  startDay DATE NOT NULL,
  endDay DATE NOT NULL,
  PRIMARY KEY (quarterID)
  );


-- Общая информация о человеке
CREATE TABLE if not exists bestgrid.person(
  id INT NOT NULL,                          
  surname VARCHAR(50) NOT NULL,
  name VARCHAR(50) NOT NULL,
  middlename VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
  );
  
-- Пользователи
CREATE TABLE if not exists bestgrid.user(
  login INT NOT NULL ,
  password VARCHAR(50) NOT NULL,
  accessLevel INT NOT NULL DEFAULT 1,
  PRIMARY KEY (login),
  FOREIGN KEY (login)
    REFERENCES bestgrid.person (id)
	ON DELETE CASCADE
    ON UPDATE CASCADE
  );
  
  -- Факторы влияющие на расписание
CREATE TABLE if not exists bestgrid.factor(
  factorID INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  value VARCHAR(50) NOT NULL,
  weight FLOAT NULL,
  PRIMARY KEY (factorID)
  );
  
-- Предмет
CREATE TABLE if not exists bestgrid.subject(
  subjectID INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  hours INT NULL default 0,
  classType VARCHAR(50) NULL default " ",
  PRIMARY KEY (subjectID)
  );
  
-- Поток
CREATE TABLE if not exists bestgrid.flow(
  flowID INT NOT NULL ,
  normHours INT NOT NULL,
  PRIMARY KEY (flowID)
  );
  
  -- Группа
CREATE TABLE if not exists bestgrid.group(
  groupID INT NOT NULL AUTO_INCREMENT,
  flowID INT NOT NULL,
  weekend VARCHAR(50) NULL,
  PRIMARY KEY (groupID, flowID),
    FOREIGN KEY (flowID)
    REFERENCES bestgrid.flow (flowID)
    ON UPDATE CASCADE
    ON DELETE CASCADE);
  

-- Кабинет
CREATE TABLE if not exists bestgrid.classroom(
  classroomNumber INT NOT NULL ,
  type VARCHAR(50) NOT NULL default "standart", -- lecture, computer
  PRIMARY KEY (classroomNumber),
    FOREIGN KEY (buildingNumber)
    REFERENCES bestgrid.building (buildingNumber)
    ON UPDATE CASCADE
    ON DELETE CASCADE);
    
-- Студент
CREATE TABLE if not exists bestgrid.student(
  studentID INT NOT NULL ,
  groupID INT NOT NULL ,
  flowID INT NOT NULL,
  PRIMARY KEY (groupID, flowID, studentID),
    FOREIGN KEY (studentID)
    REFERENCES bestgrid.person (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    FOREIGN KEY (groupID)
    REFERENCES bestgrid.group (groupID)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    FOREIGN KEY (flowID)
    REFERENCES bestgrid.flow (flowID)
    ON UPDATE CASCADE
    ON DELETE CASCADE);
  
  -- Работник
CREATE TABLE if not exists bestgrid.employee(
  employeeID INT NOT NULL AUTO_INCREMENT,
  post VARCHAR(50) NOT NULL,
  metodDay VARCHAR(50) NULL,
  isTeacher BOOLEAN NULL default true,
  PRIMARY KEY (employeeID),
    FOREIGN KEY (employeeID)
    REFERENCES bestgrid.person (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE);
    
-- Занятие
CREATE TABLE if not exists bestgrid.lesson(
  lessonID INT NOT NULL AUTO_INCREMENT,
  weekday VARCHAR(50) NULL,
  time TIME NULL,
  classroomNumber INT NULL ,
  groupID INT NULL,
  flowID INT NOT NULL,
  subjectID INT NOT NULL,
  teacherID INT NOT NULL,
  PRIMARY KEY (lessonID),
    FOREIGN KEY (classroomNumber)
    REFERENCES bestgrid.classroom (classroom)
    ON UPDATE CASCADE,
    
    FOREIGN KEY (buildingNumber)
    REFERENCES bestgrid.building (buildingNumber)
    ON UPDATE CASCADE,
    
    FOREIGN KEY (groupID)
    REFERENCES bestgrid.group (groupID)
    ON UPDATE CASCADE
    ON DELETE CASCADE,

    FOREIGN KEY (flowID)
    REFERENCES bestgrid.flow (flowID)
    ON UPDATE CASCADE
    ON DELETE CASCADE,

    FOREIGN KEY (subjectID)
    REFERENCES bestgrid.subject (subjectID)
    ON UPDATE CASCADE
    ON DELETE CASCADE,

    FOREIGN KEY (teacherID)
    REFERENCES bestgrid.person (id)
    ON UPDATE CASCADE
    );
  
 