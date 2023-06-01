CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  age INT NOT NULL,
  address VARCHAR(100) NOT NULL
);

INSERT INTO students (name, age, address) VALUES ('John Smith', 17, 'Moscow');
INSERT INTO students (name, age, address) VALUES ('Alice Brown', 22, 'Moscow');
INSERT INTO students (name, age, address) VALUES ('David Johnson', 25, 'St. Petersburg');
INSERT INTO students (name, age, address) VALUES ('Olga Petrova', 24, 'Moscow');
INSERT INTO students (name, age, address) VALUES ('Vladimir Ivanov', 23, 'Moscow');


SELECT name FROM students WHERE address = 'Moscow' AND age >= 18 AND age < 30;