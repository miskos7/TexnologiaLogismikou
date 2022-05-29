DROP DATABASE smart_coffee;
CREATE DATABASE smart_coffee;
USE smart_coffee;

CREATE TABLE user(
    username VARCHAR(12) NOT NULL,
    password VARCHAR(10) NOT NULL,
    PRIMARY KEY(username)
);

CREATE TABLE menu_kafes(
    k_product VARCHAR(100) NOT NULL,
    k_price FLOAT NOT NULL DEFAULT 0.00,
    PRIMARY KEY(k_product)
);

CREATE TABLE menu_faghta(
    f_product VARCHAR(100) NOT NULL,
    f_price FLOAT NOT NULL DEFAULT 0.00,
    PRIMARY KEY(f_product)
);

CREATE TABLE menu_loipa(
    l_product VARCHAR(100) NOT NULL,
    l_price FLOAT NOT NULL DEFAULT 0.00,
    PRIMARY KEY(l_product)
);

CREATE TABLE orders(
	o_num INT NOT NULL DEFAULT 0,
    o_product VARCHAR(100) NOT NULL,
    o_comments VARCHAR(50) NOT NULL,
    o_quantity INT NOT NULL DEFAULT 0,
    o_price FLOAT NOT NULL DEFAULT 0.00,
    o_username VARCHAR(12) NOT NULL
);

CREATE TABLE amount(
    a_price FLOAT NOT NULL DEFAULT 0.00,
    a_username VARCHAR(12) NOT NULL
);

CREATE TABLE admin(
	num_pistopoihtikwn INT NOT NULL DEFAULT 0,
	paragelia ENUM('TRUE','FALSE') DEFAULT NULL,
	plhrwmh ENUM('TRUE','FALSE') DEFAULT NULL,
	boh8eia_serbitorou ENUM('TRUE','FALSE') DEFAULT NULL,
	trapezi VARCHAR(12) NOT NULL
);

INSERT INTO user VALUES
('admin','1234'),
('trapezi 1','1234'),
('trapezi 2','1234'),
('trapezi 3','1234'),
('trapezi 4','1234'),
('trapezi 5','1234'),
('trapezi 6','1234');

INSERT INTO menu_kafes VALUES
('Ellinikos Kafes','2.00'),
('Gallikos Kafes','3.00'),
('Espresso Monos','2.00'),
('Espresso Diplos','3.00'),
('Cappuccino','3.50'),
('Freddo Espresso','3.00'),
('Freddo Cappuccino','3.50');

INSERT INTO menu_faghta VALUES
('Club Sandwich Aplo','5.00'),
('Club Sandwich Fileto Kotopoulo','6.50'),
('Bafla me 1 mpala pagwto','5.00');

INSERT INTO menu_loipa VALUES
('Coca-Cola','2.30'),
('Coca-Cola Light','2.30'),
('Coca-Cola Zero','2.30'),
('Fanta Portokalada me An8rakiko','2.30'),
('Fanta Portokalada xwris An8rakiko','2.30'),
('Fanta Lemonada','2.30'),
('Sprite','2.30'),
('Fusikos Xumos Portokali','3.00'),
('Xumos Anameiktos','3.00');

INSERT INTO amount VALUES
('','trapezi 1'),
('','trapezi 2'),
('','trapezi 3'),
('','trapezi 4'),
('','trapezi 5'),
('','trapezi 6');

INSERT INTO admin VALUES
('','FALSE','FALSE','FALSE','trapezi 1'),
('','FALSE','FALSE','FALSE','trapezi 2'),
('','FALSE','FALSE','FALSE','trapezi 3'),
('','FALSE','FALSE','FALSE','trapezi 4'),
('','FALSE','FALSE','FALSE','trapezi 5'),
('','FALSE','FALSE','FALSE','trapezi 6');


DELIMITER $
DROP TRIGGER IF EXISTS synoliko_poso$
CREATE TRIGGER synoliko_poso
AFTER INSERT ON orders
FOR EACH ROW 
BEGIN
CALL synoliko_poso(new.o_username,new.o_price,new.o_quantity);
END $
DELIMITER ;

DELIMITER $
DROP TRIGGER IF EXISTS orders_num$
CREATE TRIGGER orders_num
BEFORE INSERT ON orders
FOR EACH ROW
BEGIN
DECLARE numoforders INT;
SELECT COUNT(*) INTO numoforders
FROM orders WHERE orders.o_username=new.o_username;
SET new.o_num= numoforders + 1;
END $ 
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS numofpistopoihtika$
CREATE PROCEDURE numofpistopoihtika(IN trapezi VARCHAR(12))
BEGIN
DECLARE num INT;
SELECT admin.num_pistopoihtikwn INTO num 
FROM admin WHERE admin.trapezi=trapezi;
UPDATE admin
SET admin.num_pistopoihtikwn= num + 1
WHERE admin.trapezi=trapezi;
END $ 
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS insert_order$
CREATE PROCEDURE insert_order(IN o_product VARCHAR(100),IN o_comments VARCHAR(50),IN o_quantity INT,IN o_price FLOAT,IN o_username VARCHAR(12))
BEGIN
INSERT INTO orders VALUES
('',o_product,o_comments,o_quantity,o_price,o_username);
END$
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS synoliko_poso$
CREATE PROCEDURE synoliko_poso(IN username VARCHAR(12),IN price FLOAT,IN quantity FLOAT)
BEGIN
DECLARE timi FLOAT;
DECLARE posotita FLOAT;
DECLARE not_found INT;
DECLARE gcursor CURSOR FOR
SELECT orders.o_price,orders.o_quantity FROM orders
WHERE orders.o_username=username AND orders.o_price=price AND orders.o_quantity=quantity;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET not_found=1;
OPEN gcursor;
SET not_found=0;
FETCH gcursor INTO timi,posotita;
IF (not_found=0) THEN
	UPDATE amount
	SET amount.a_price=amount.a_price + (timi * posotita)
	WHERE amount.a_username=username;
	FETCH gcursor INTO timi,posotita;
END IF;
CLOSE gcursor;
END$
DELIMITER ;
