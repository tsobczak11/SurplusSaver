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

CREATE TABLE farm (
   farm_id     SMALLINT UNSIGNED NOT NULL UNIQUE,
   order_id    SMALLINT UNSIGNED NOT NULL UNIQUE,
   shipment_id SMALLINT UNSIGNED NOT NULL UNIQUE,
   location_id SMALLINT UNSIGNED NOT NULL UNIQUE,
   PRIMARY KEY(farm_id),
   FOREIGN KEY (order_id) REFERENCES orders(order_id),
   FOREIGN KEY (shipment_id) REFERENCES transport(shipment_id)
);

CREATE TABLE transport (
   shipment_id SMALLINT UNSIGNED NOT NULL UNIQUE,
   order_id    SMALLINT UNSIGNED NOT NULL UNIQUE,
   shipment_date date NOT NULL,
   PRIMARY KEY (shipment_id),
   FOREIGN KEY (order_id) REFERENCES orders(order_id)
);
