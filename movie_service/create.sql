create sequence hibernate_sequence start 1 increment 1
create table movie (id int8 not null, created_at timestamp, description varchar(255), director varchar(255), movie_name varchar(255), updated_at timestamp, primary key (id))
