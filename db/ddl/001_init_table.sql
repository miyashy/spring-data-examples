CREATE DATABASE sample;
use sample;

CREATE TABLE todos (
    todo_id varchar(36) not null ,
    summary varchar(64) not null ,
    description varchar(128) not null,
    status int(2) not null,
    primary key (todo_id));