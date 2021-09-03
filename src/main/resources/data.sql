DROP TABLE IF EXISTS PERSON;
DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE IF NOT EXISTS PERSON(
                                     id INT NOT NULL PRIMARY KEY,
                                     first_name VARCHAR(50) NOT NULL,
                                     last_name VARCHAR(50) NOT NULL,
                                     age int NOT NULL,
                                     passport VARCHAR(15)
);
CREATE TABLE IF NOT EXISTS USERS(
                                   id INT NOT NULL PRIMARY KEY,
                                   is_temp BOOLEAN NOT NULL DEFAULT false,
                                   name VARCHAR(50) NOT NULL,
                                   rating INT NOT NULL,
                                   nickname VARCHAR(50) NOT NULL


);
CREATE TABLE IF NOT EXISTS EMPLOYEE(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    salary INT NOT NULL ,
    fired BOOLEAN NOT NULL

);
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (10, 'irina', 'petrovskaya', 51, '8888123456');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (20, 'andrey', 'ivanov', 51,'9999123456');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (30, 'vera', 'ivanova', 25,'8888888888');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (40, 'lev', 'blinov', 25,'1234567899');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (50, 'bronya', 'blinov', 10,'n/a');
INSERT into USERS (id,name ,rating, nickname) VALUES (1, 'vasya pupkin', 0, 'pupok');
INSERT into USERS (id,name ,rating, nickname) VALUES (2, 'ivan ivanov', 5, 'chief');
INSERT into EMPLOYEE(name, salary, fired) VALUES ( 'maria',50,false );
INSERT into EMPLOYEE(name, salary, fired) VALUES ( 'anna',100,false );
INSERT into EMPLOYEE(name, salary, fired) VALUES ( 'daria',50,false );
