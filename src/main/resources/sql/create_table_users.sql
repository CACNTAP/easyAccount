CREATE TABLE Users (
User_id VARCHAR(12) PRIMARY KEY not NULL,
User_name VARCHAR(16) not NULL,
User_password VARCHAR(16) not null,
User_mobile VARCHAR(11),
User_mail VARCHAR(30) not NULL,
User_description VARCHAR(60) not NULL
);