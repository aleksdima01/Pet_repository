___

## Итоговая контрольная работа по блоку специализация

___ 

### Задание

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда.
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
4. Установить и удалить deb-пакет с помощью dpkg.
5. Выложить историю команд в терминале ubuntu
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
    11.Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
    В программе должен быть реализован следующий функционал:  
    14.1 Завести новое животное  
    14.2 Определять животное в правильный класс  
    14.3 Увидеть список команд, которое выполняет животное  
    14.4 Обучить животное новым командам  
    14.5 Реализовать навигацию по меню
15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
    значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое
    животное” Сделайте так, чтобы с объектом такого типа можно было работать в
    блоке try-with-resources. Нужно бросить исключение, если работа с объектом
    типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
    считать в ресурсе try, если при заведении животного заполнены все поля.

---       

### Выполнение

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
   ![1](https://github.com/aleksdima01/Pet_repository/assets/118337664/c53123d0-5d18-4579-b461-4d604bf2a6be)

2. Создать директорию, переместить файл туда.
   ![2](https://github.com/aleksdima01/Pet_repository/assets/118337664/f3d0bd8d-2095-4c27-8df8-2df59495ac81)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
   ![3](https://github.com/aleksdima01/Pet_repository/assets/118337664/9582b803-70cd-445a-9913-6fcffb5429d5)
   ![3 1](https://github.com/aleksdima01/Pet_repository/assets/118337664/1ea9be8a-e661-4a06-91cc-ccc589adad68)
   ![3 2](https://github.com/aleksdima01/Pet_repository/assets/118337664/cd76501a-c5bf-45c3-892f-733a9c781eab)

4. Установить и удалить deb-пакет с помощью dpkg
   ![4](https://github.com/aleksdima01/Pet_repository/assets/118337664/521990c0-f1d8-424c-80b3-990533fd765c)
   ![4 1](https://github.com/aleksdima01/Pet_repository/assets/118337664/e809fe8b-0024-41a7-8955-be768114dbd7)

5. Выложить историю команд в терминале ubuntu
   [История команд](./commands_history.txt)
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
   ![6](https://github.com/aleksdima01/Pet_repository/assets/118337664/dd5b9fea-f16d-405b-8970-17a931317153)

7. В подключенном MySQL репозитории создать базу данных “Друзья человека”

``` 
DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;
```

8. Создать таблицы с иерархией из диаграммы в БД
   ![8](https://github.com/aleksdima01/Pet_repository/assets/118337664/2227e1af-46ab-4782-87ef-c8251c7d0bc4)

9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения

```
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
```

10. Удалить из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.  
    ```DROP TABLE camels;```

```
SELECT
name,birthday,commands
FROM horses
UNION
SELECT
name,birthday,commands
FROM donkeys;
```

![10](https://github.com/aleksdima01/Pet_repository/assets/118337664/be011777-bce8-4aaf-8401-5552fc35d862)

11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице

```
DROP TABLE IF EXISTS ages; 
CREATE TABLE ages AS
SELECT name,birthday,commands, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) as age_in_month FROM dogs
WHERE TIMESTAMPDIFF(MONTH, birthday, CURDATE()) BETWEEN 12 AND 35
UNION
SELECT name,birthday,commands, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) as age_in_month FROM cats
WHERE TIMESTAMPDIFF(MONTH, birthday, CURDATE()) BETWEEN 12 AND 35
UNION
SELECT name,birthday,commands, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) as age_in_month FROM hamsters
WHERE TIMESTAMPDIFF(MONTH, birthday, CURDATE()) BETWEEN 12 AND 35
UNION
SELECT name,birthday,commands, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) as age_in_month FROM horses
WHERE TIMESTAMPDIFF(MONTH, birthday, CURDATE()) BETWEEN 12 AND 35
UNION
SELECT name,birthday,commands, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) as age_in_month FROM donkeys
WHERE TIMESTAMPDIFF(MONTH, birthday, CURDATE()) BETWEEN 12 AND 35;

SELECT * FROM ages
```

![11](https://github.com/aleksdima01/Pet_repository/assets/118337664/365d20e2-9397-40f6-86c6-c865bbdffdad)

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.

```
SELECT dogs.name, dogs.birthday, dogs.commands, ha.animal_name, ages.age_in_month 
FROM dogs
LEFT JOIN ages ON ages.name = dogs.name
LEFT JOIN home_animals ha ON ha.Id = dogs.class_id
UNION
SELECT cats.name, cats.birthday, cats.commands, ha.animal_name, ages.age_in_month 
FROM cats
LEFT JOIN ages ON ages.name = cats.name
LEFT JOIN home_animals ha ON ha.Id = cats.class_id
UNION
SELECT ham.name, ham.birthday, ham.commands, ha.animal_name, ages.age_in_month 
FROM hamsters ham
LEFT JOIN ages ON ages.name = ham.name
LEFT JOIN home_animals ha ON ha.Id = ham.class_id
UNION
SELECT horses.name, horses.birthday, horses.commands, pa.animal_name, ages.age_in_month 
FROM horses 
LEFT JOIN ages ON ages.name = horses.name
LEFT JOIN packed_animals pa ON pa.Id = horses.class_id
UNION 
SELECT donkeys.name, donkeys.birthday, donkeys.commands, pa.animal_name, ages.age_in_month 
FROM donkeys 
LEFT JOIN ages ON ages.name = donkeys.name
LEFT JOIN packed_animals pa ON pa.Id = donkeys.class_id;
```

![12](https://github.com/aleksdima01/Pet_repository/assets/118337664/08c45a5d-a955-4c71-bfda-8bc58988e87b)

13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
    ![13]()

14. Написать программу, имитирующую работу реестра домашних животных.
    В программе должен быть реализован следующий функционал:  
    14.1 Завести новое животное  
    14.2 Определять животное в правильный класс  
    14.3 Увидеть список команд, которое выполняет животное  
    14.4 Обучить животное новым командам  
    14.5 Реализовать навигацию по меню
