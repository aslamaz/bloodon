CREATE DATABASE bloodon;
USE bloodon;

CREATE TABLE `admin_user` (
  `id_admin_user` int NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id_admin_user`),
  UNIQUE KEY `username` (`username`)
);
INSERT INTO admin_user (username, password, created_at, updated_at) VALUES ('user', '123456');
CREATE TABLE donor(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL ,
    blood_group VARCHAR(5) NOT NULL,
    gender VARCHAR(20) NOT NULL,
    mobile_no VARCHAR(20) NOT NULL,
      `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
);
