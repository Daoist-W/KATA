CREATE DATABASE IF NOT EXISTS babyamazon;
USE babyamazon;


DROP TABLE IF EXISTS Shipments;
DROP TABLE IF EXISTS Orders ;
DROP TABLE IF EXISTS Customers;

CREATE TABLE IF NOT EXISTS Customers (
	customer_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	customer_name CHAR(50) NOT NULL,
	customer_email CHAR(50) NOT NULL,
	customer_phone VARCHAR(15),
	PRIMARY KEY(customer_id)
) AUTO_INCREMENT=1;

INSERT INTO Customers (customer_name, customer_email, customer_phone)
VALUES
  ("Holly Travis","auctor.vitae@protonmail.couk","1-941-264-2416"),
  ("Philip Gould","mi.tempor.lorem@icloud.couk","(136) 473-8851"),
  ("Susan Barnes","maecenas.iaculis@google.com","(276) 320-8610"),
  ("Keaton Marks","gravida.molestie@yahoo.ca","1-863-966-4374"),
  ("Hall Valenzuela","et.rutrum@outlook.net","1-245-862-3986"),
  ("Asher Britt","aliquet@aol.com","(878) 644-8444"),
  ("Axel Weeks","erat.sed@protonmail.net","1-383-585-4172"),
  ("Bevis Wynn","laoreet.ipsum@aol.org","(273) 838-4725"),
  ("Malachi Witt","pellentesque@icloud.edu","1-952-883-3276"),
  ("Ishmael Horton","amet.ultricies@google.ca","(104) 745-1371");

