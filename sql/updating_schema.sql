-- //adding data to users table

insert into users(name,email,password,role)values
('Moni','moni@gmail.com','mouni123','user'),
('nani','nani@gmail.com','nani123','user'),
('sri','sri@gmail.com','sri123','user');


-- ////adding data to categories table

insert into categories(name)
values
('Java'),
('Sql'),
('Springboot'),
('DSA');

-- ...////inserting data into tags table

insert into tags(name)
values
('java'),
('spring'),
('sql'),
('dsa');

-- ...////inserting into notes table

insert into notes(user_id,category_id,title,content,summary)
values
(1,3,'Springboot rest api','Spring boot is used to build rest apis easily.
it provides auto configuration and embedded server support','Spring boot simplifies rest api development');

insert into notes(user_id,category_id,title,content,summary)
values
(1,1,'Java OOP Concepts',
    'Object oriented programming in Java is based on encapsulation, inheritance, polymorphism and abstraction.',
    'Java OOP has four major concepts.');
    
   --  ...////inserting tags to notes
   
   insert into note_tags(note_id,tag_id)
   values
   (1,2),
   (1,3),
   (1,1),
   (1,4);
   
   
  --  /......///droping tables
  
  drop table notes;
  drop table users;
  drop table tags;
  drop table note_tags;
  drop table categories;
  
--   
--   .../////////again creating tables//////


create table users(
id bigint primary key auto_increment,
name varchar(50) not null,
email varchar(50)not null unique,
password varchar(50) not null,
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp);


-- ...//////creating notes table..////

create table notes(
id bigint primary key auto_increment,
user_id bigint not null,
title varchar(255) not null,
summary text not null,
created_at datetime default current_timestamp,
updated_at datetime default current_timestamp,
	constraint fk_notes_user
		foreign key(user_id)
        references users(id)
);

show tables;

-- ..//////inserting again data

insert into users(name,email,password)
values
('Moni','moni@gmail.com','moni123'),
('Nani','nani@gmal.com','nani123'),
('sri','sri@gmail.com','sri123');

insert into notes(user_id,title,summary)
values
(
    1,
    'Spring Boot JPA',
    'Spring Boot JPA simplifies database interaction by allowing Java objects to be mapped to database tables.'
),
(
    1,
    'Java Streams',
    'Java Streams provide a functional approach for processing collections of data.'
);



INSERT INTO notes (user_id, title, summary)
VALUES
(
    2,
    'Docker',
    'Docker packages applications and their dependencies into portable containers.'
);



select * from users;
select * from notes;


select 
n.id,
n.title,
n.summary
from notes n
where n.user_id=1;