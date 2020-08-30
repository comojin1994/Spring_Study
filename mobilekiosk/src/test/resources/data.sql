CREATE TABLE STORE(
    ID LONG,
    NAME VARCHAR(50),
    PHONENUMBER VARCHAR(13),
    QRCODE VARCHAR(1000)
);

CREATE TABLE MENU(
    ID LONG,
    STOREID LONG,
    NAME VARCHAR(50),
    PRICE INTEGER,
    CATEGORY VARCHAR(20),
    PICTURE VARCHAR(1000),
    DETAIL VARCHAR(2000)
);

INSERT INTO STORE('ID', 'NAME', 'PHONENUMBER', 'QRCODE')
VALUE (1, 'My cafe', '010-1234-5678', 'https://www.storage.com/1');

INSERT INTO MENU('ID', 'STOREID', 'NAME', 'PRICE', 'CATEGORY', 'PICTURE', 'DETAIL')
VALUES (1, 1, 'americano', 4200, 'americano', 'https://www.naver.com', 'hot americano'),
       (2, 1, 'latte', 5300, 'latte', 'https://www.google.com', 'milk lattee'),
       (3, 1, 'hot choco', 6500, 'juice', 'https://www.hot.com', 'hot choco');
