CREATE DATABASE sonic;

USE sonic;

CREATE TABLE cars(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), price INTEGER );


INSERT INTO cars(name, price) VALUES("Audi",52465);

INSERT INTO cars(name, price) VALUES("Mercedes",50000);

INSERT INTO cars(name, price) VALUES("Aulto",74536);

INSERT INTO cars(name, price) VALUES("Thar",45623);

INSERT INTO cars(name, price) VALUES("Tata",98753);

INSERT INTO cars(name, price) VALUES("Citron",78541);

INSERT INTO cars(name, price) VALUES("Hummer",368745);

INSERT INTO cars(name, price) VALUES("Bently",45789);

INSERT INTO cars(name, price) VALUES("Volvo",861125);

INSERT INTO cars(name, price) VALUES("Skoda",45875);

INSERT INTO cars(name, price) VALUES("Volkswaen",565412);

INSERT INTO cars(name, price) VALUES("Mahindra",68115);

SELECT * FROM cars;

SHOW TABLES;

DESCRIBE cars;
