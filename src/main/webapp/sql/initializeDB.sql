CREATE DATABASE IF NOT EXISTS surplus_saver;

USE surplus_saver;

CREATE TABLE user
(

	username VARCHAR(50) primary key,
    `password` VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);


CREATE TABLE entity1
(

	username VARCHAR(50) primary key,
    `password` VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);


CREATE TABLE category (
	category_id				VARCHAR(5) NOT NULL,
	category_name			VARCHAR(50) NOT NULL,
	category_description	VARCHAR(50) NOT NULL,
	PRIMARY KEY	(category_id)
);


CREATE TABLE orders (
	order_id VARCHAR(5) NOT NULL,
	recipient_id VARCHAR(5) NOT NULL,
	order_date DATE,
	recipient_recipient_id VARCHAR(5) NOT NULL	
);


CREATE TABLE farm (
   farm_id     VARCHAR(5) NOT NULL UNIQUE,
   order_id    VARCHAR(5) NOT NULL UNIQUE,
   shipment_id VARCHAR(5) NOT NULL UNIQUE,
   PRIMARY KEY(farm_id)
);

CREATE TABLE transport (
   shipment_id VARCHAR(5) NOT NULL UNIQUE,
   order_id    VARCHAR(5) NOT NULL UNIQUE,
   shipment_date date NOT NULL,
   PRIMARY KEY (shipment_id)
);



CREATE TABLE recipient (
	recipient_id			VARCHAR(5) NOT NULL,
	recipient_first_name	CHAR(50) NOT NULL,
	recipient_last_name		CHAR(50) NOT NULL,
	recipient_location		SMALLINT UNSIGNED NOT NULL,
	recipient_email			CHAR(50) NOT NULL,
	PRIMARY KEY (recipient_id)
);


CREATE TABLE crop (
	crop_id 	VARCHAR(5) NOT NULL,
	crop_name	VARCHAR(5) NOT NULL,
	crop_category VARCHAR(5) NOT NULL,
	crop_description LONGTEXT
);

CREATE TABLE quantity (
	crop_id 	VARCHAR(5) NOT NULL,
	quantity	INT UNSIGNED
);

