CREATE TABLE IF NOT EXISTS user (
  id SERIAL primary key,
  username varchar(255) NOT NULL,
  first_name varchar(255) DEFAULT NULL,
  surname varchar(255) DEFAULT NULL,
  email varchar(255) NOT NULL,
  birth_date date DEFAULT NULL,
  registered timestamp NOT NULL
);
--rollback DROP TABLE user;

CREATE TABLE IF NOT EXISTS movie (
  id SERIAL primary key,
  title varchar(255) DEFAULT NULL,
  director bigint DEFAULT NULL,
  premiere date DEFAULT NULL,
  type varchar(30) NOT NULL,
  reserved boolean DEFAULT FALSE,
  reserved_by bigint DEFAULT NULL,
  reservation_expires timestamp DEFAULT NULL
);
--rollback DROP TABLE movie;

CREATE TABLE IF NOT EXISTS director (
  id SERIAL primary key,
  name varchar(255) DEFAULT NULL,
  surname varchar(255) DEFAULT NULL,
  birth_date date DEFAULT NULL
);
--rollback DROP TABLE director;

CREATE TABLE IF NOT EXISTS actor (
  id SERIAL primary key,
  name varchar(255) DEFAULT NULL,
  surname varchar(255) DEFAULT NULL,
  birth_date date DEFAULT NULL
);
--rollback DROP TABLE actor;
