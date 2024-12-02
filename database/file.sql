CREATE DATABASE projeto;
USE projeto;

CREATE TABLE Person (
    person_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL CHECK (age >= 0),
    type VARCHAR(15) NOT NULL CHECK (type IN ('Adult', 'Child')),
    responsible_adult_id INT,
    FOREIGN KEY (responsible_adult_id) REFERENCES Person (person_id) ON DELETE SET NULL
);

CREATE TABLE Gondola (
    gondola_id INT AUTO_INCREMENT PRIMARY KEY,
    number INT NOT NULL UNIQUE,
    seat1_person_id INT,
    seat2_person_id INT,
    FOREIGN KEY (seat1_person_id) REFERENCES Person (person_id) ON DELETE SET NULL,
    FOREIGN KEY (seat2_person_id) REFERENCES Person (person_id) ON DELETE SET NULL
);