DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;

DROP TABLE IF EXISTS pets;
CREATE TABLE pets
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	class_name VARCHAR(20)
);

INSERT INTO pets (class_name)
VALUES ('вьючные'),
('домашние');  

DROP TABLE IF EXISTS packed_animals;
CREATE TABLE packed_animals
(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR (28),
    class_id INT NOT NULL,
    FOREIGN KEY (class_id) REFERENCES pets (Id)
);

INSERT INTO packed_animals (animal_name, class_id)
VALUES ('Лошади', 1), 
('Верблюды', 1),
('Ослы', 1);
 
DROP TABLE IF EXISTS home_animals; 
CREATE TABLE home_animals
(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    animal_name VARCHAR (28),
    class_id INT NOT NULL,
    FOREIGN KEY (class_id) REFERENCES pets (Id)
);

INSERT INTO home_animals (animal_name, class_id)
VALUES 
('Собаки', 2), 
('Кошки', 2), 
('Хомяки', 2); 

DROP TABLE IF EXISTS dogs; 
CREATE TABLE dogs 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES home_animals (Id)
);

INSERT INTO dogs (name, birthday, commands, class_id)
VALUES ('Fido', '2020-01-01', 'Sit, Stay, Fetch', 1),
('Buddy', 	'2018-12-10',	'Sit, Paw, Bark', 1),  
('Bella', '2019-11-11', 'Sit, Stay, Roll', 1);

DROP TABLE IF EXISTS cats; 
CREATE TABLE cats 
(       
	Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES home_animals (Id)
);

INSERT INTO cats (name, birthday, commands, class_id)
VALUES ('Whiskers', '2019-05-15', 'Sit, Pounce', 2),
('Smudge', '2020-02-20', 'Sit, Pounce, Scratch', 2),  
('Oliver', '2020-06-30', 'Meow, Scratch, Jump', 2); 

DROP TABLE IF EXISTS hamsters; 
CREATE TABLE hamsters 
(       
	Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES home_animals (Id)
);

INSERT INTO hamsters (name, birthday, commands, class_id)
VALUES ('Hammy', '2021-03-10', 'Roll, Hide', 3),
('Peanut', '2021-08-01', 'Roll, Spin', 3);

DROP TABLE IF EXISTS horses; 
CREATE TABLE horses 
(       
	Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES packed_animals (Id)
);

INSERT INTO horses (name, birthday, commands, class_id)
VALUES ('Thunder', '2015-07-21', 'Trot, Canter, Gallop', 1),
('Storm', '2014-05-05', 'Trot, Canter', 1),  
('Blaze', '2016-02-29', 'Trot, Jump, Gallop', 1); 

DROP TABLE IF EXISTS camels; 
CREATE TABLE camels 
(       
	Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES packed_animals (Id)
);

INSERT INTO camels (name, birthday, commands, class_id)
VALUES ('Sandy', '2016-11-03', 'Walk, Carry Load', 2),
('Dune', '2018-12-12', 'Walk, Sit', 2),  
('Sahara', '2015-08-14', 'Walk, Run', 2); 

DROP TABLE IF EXISTS donkeys; 
CREATE TABLE donkeys 
(       
	Id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(28), 
    birthday DATE,
    commands VARCHAR(60),
    class_id int NOT NULL,
    FOREIGN KEY (class_id) REFERENCES packed_animals (Id)
);

INSERT INTO donkeys (name, birthday, commands, class_id)
VALUES ('Eeyore', '2017-09-18', 'Walk, Carry Load, Bray', 3),
('Burro', '2019-01-23', 'Walk, Bray, Kick', 3);

DROP TABLE camels;

SELECT 
name,birthday,commands 
FROM horses
UNION
SELECT
name,birthday,commands 
FROM donkeys;

# Создать новую таблицу “молодые животные” в которую попадут все
#животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
#до месяца подсчитать возраст животных в новой таблице


