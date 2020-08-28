INSERT INTO PERSON('id', 'name', 'age', 'bloodType', 'year_of_birthday', 'month_of_birthday', 'day_of_birthday', 'job') VALUES (1, 'martin', 10, 'A', 1991, 8, 15, 'programmer');
INSERT INTO PERSON('id', 'name', 'age', 'bloodType', 'year_of_birthday', 'month_of_birthday', 'day_of_birthday') VALUES (2, 'david', 9, 'B', 1992, 7, 21);
INSERT INTO PERSON('id', 'name', 'age', 'bloodType', 'year_of_birthday', 'month_of_birthday', 'day_of_birthday') VALUES (3, 'dennis', 8, 'O', 1993, 10, 15);
INSERT INTO PERSON('id', 'name', 'age', 'bloodType', 'year_of_birthday', 'month_of_birthday', 'day_of_birthday') VALUES (4, 'sophia', 7, 'AB', 1994, 8, 30);
INSERT INTO PERSON('id', 'name', 'age', 'bloodType', 'year_of_birthday', 'month_of_birthday', 'day_of_birthday') VALUES (5, 'benny', 6, 'A', 1995, 12, 23);

INSERT INTO block('id','name') values (1, 'dennis');
INSERT INTO block('id','name') values (2, 'sophia');

update person set block_id = 1 where id = 3;
update person set block_id = 2 where id = 4;