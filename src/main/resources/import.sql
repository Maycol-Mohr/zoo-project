INSERT INTO tb_manager(name) VALUES ('Paul');
INSERT INTO tb_manager(name) VALUES ('Roberta');
INSERT INTO tb_manager(name) VALUES ('Ana');
INSERT INTO tb_manager(name) VALUES ('Rodrigo');
INSERT INTO tb_manager(name) VALUES ('Peterson');
INSERT INTO tb_manager(name) VALUES ('Vanio');
INSERT INTO tb_manager(name) VALUES ('Petersen');
INSERT INTO tb_manager(name) VALUES ('Nuria');
INSERT INTO tb_manager(name) VALUES ('Suzana');
INSERT INTO tb_manager(name) VALUES ('Ramón');
INSERT INTO tb_manager(name) VALUES ('Jorge');
INSERT INTO tb_manager(name) VALUES ('Vanda');
INSERT INTO tb_manager(name) VALUES ('Beatriz');

INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('rex', 'dog', 'male', 4, 'Brazil');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('tom', 'cat', 'female', 8, 'Brazil');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('bob', 'mouse', 'female', 2, 'USA');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('victor', 'horse', 'male', 7, 'Spain');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('marley', 'dog', 'male', 5, 'Italy');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('paul', 'lion', 'female', 6, 'Zambia');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('saulo', 'spider', 'female', 2, 'Brazil');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('zain', 'lion', 'male', 4, 'Niger');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('ariel', 'fox', 'male', 2, 'USA');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('carl', 'dog', 'female', 10, 'Argentina');
INSERT INTO tb_animal(name, species, sex, age, location) VALUES ('denner', 'lion', 'male', 5, 'Niger');

INSERT INTO tb_caretaker(name, manager_id) VALUES ('Rodolfo', 1);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Gabriel', 2);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Renata', 3);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Bismark', 4);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Gedel', 5);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Gorette', 6);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Fagner', 7);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Zoraide', 8);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Filomena', 9);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Zacarias', 10);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Peter', 11);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Beatriz', 12);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Beatriz', 13);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Ronaldo', 2);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Zidane', 2);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Romário', 5);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('David', 5);
INSERT INTO tb_caretaker(name, manager_id) VALUES ('Leonardo', 5);

INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (1, 1);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (2, 1);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (3, 2);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (4, 3);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (5, 4);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (6, 5);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (7, 6);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (8, 7);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (9, 8);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (10, 9);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (11, 10);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (11, 9);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (11, 8);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (6, 10);
INSERT INTO tb_animal_caretaker(animal_id, caretaker_id) VALUES (6, 2);