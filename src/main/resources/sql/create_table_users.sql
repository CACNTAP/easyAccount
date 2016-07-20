CREATE TABLE Users (
userid BIGINT PRIMARY KEY not NULL AUTO_INCREMENT,
userName VARCHAR(16) not NULL,
password VARCHAR(16) not null,
mobile VARCHAR(11),
mail VARCHAR(30) not NULL,
description VARCHAR(60) 
);