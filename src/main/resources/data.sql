DROP TABLE IF EXISTS PERSON;
CREATE TABLE IF NOT EXISTS PERSON(
                                     id INT NOT NULL PRIMARY KEY,
                                     first_name VARCHAR(50) NOT NULL,
                                     last_name VARCHAR(50) NOT NULL,
                                     age int NOT NULL,
                                     passport VARCHAR(15)
);
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (10, 'irina', 'petrovskaya', 51, '8888123456');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (20, 'andrey', 'ivanov', 51,'9999123456');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (30, 'vera', 'ivanova', 25,'8888888888');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (40, 'lev', 'blinov', 25,'1234567899');
INSERT into PERSON (id,first_name, last_name, age, passport) VALUES (50, 'bronya', 'blinov', 10,'n/a');

