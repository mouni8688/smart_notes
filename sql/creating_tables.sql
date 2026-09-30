create database smart_notes;
show databases;

use smart_notes;

-- ///creating user table   id,name,email,password,role,create at,updated at

create table users(
id bigint primary key auto_increment,
name varchar(50) not null,
email varchar(50) not null unique,
password varchar(20) not null,
role varchar(20) not null default 'USER',
create_at  datetime default current_timestamp,
update_at datetime default current_timestamp);


-- creating categories table   id,  name ,created at,updated at
create table categories(
id bigint primary key auto_increment,
name varchar(50) not null unique,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp);


-- /////......creating notes table   id, user_id, category_id,title,content  text,

create table notes(
id bigint primary key auto_increment,
user_id  bigint not null,
category_id bigint not null,
title varchar(200) not null unique,
content text  not null,
summary text ,
created_at datetime default current_timestamp,
updated_at datetime default current_timestamp,

constraint fk_notes_user
	foreign key(user_id)
    references users(id),
    
constraint fk_notes_category
	foreign key(category_id)
    references categories(id));
    
    
-- /////creating tags table  id,name,createdat,updatedat

create table tags(
id bigint primary key auto_increment,
name varchar(50) not null unique,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp); 



-- ////creating notes-tags table   note_id,tag_id,

create table note_tags(
note_id bigint not null,
tag_id bigint not null,
primary key(note_id,tag_id),

constraint fk_note_tags_note
	foreign key(note_id)
    references notes(id)
    on delete cascade,
    
constraint fk_note_tags_tag
	foreign key(tag_id)
    references tags(id)
    on delete cascade);
    
    show tables;
    

