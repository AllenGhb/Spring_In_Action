DROP TABLE if EXISTS spittle;
DROP TABLE if EXISTS spitter;

CREATE TABLE spitter (
  id identity,
  username VARCHAR(25) not null,
  password VARCHAR(25) not null,
  fullName VARCHAR(100) not null,
  email varchar(50) not null,
  updateByEmail boolean not null
);

create table spittle(
  id integer IDENTITY primary key,
  spitter integer not null,
  message varchar(2000) not null,
  postedTime datetime not null,
  foreign key (spitter) REFERENCES  spitter(id)
)