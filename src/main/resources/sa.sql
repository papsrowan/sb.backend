CREATE DATEBASE SA

CREATE TABLE client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) UNIQUE
);

CREATE TABLE sentiment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    texte TEXT,
    type VARCHAR(50),
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES client(id)
);