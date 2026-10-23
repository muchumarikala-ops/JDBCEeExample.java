
CREATE DATABASE mydatabase;

USE mydatabase;

CREATE TABLE users (
    id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO users VALUES
(1, 'Ravi', 'ravi@example.com'),
(2, 'Sita', 'sita@example.com'),
(3, 'Kiran', 'kiran@example.com');

SELECT * FROM users;
