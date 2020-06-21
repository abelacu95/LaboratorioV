CREATE DATABASE spring_example;
#drop database spring_example;
use spring_example;

#SET GLOBAL time_zone = '-3:00';

CREATE TABLE persons(
	id_person int auto_increment,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    CONSTRAINT pk_persons_id_person PRIMARY KEY (id_person) );

CREATE TABLE pets(
	id_pet int auto_increment,
    id_person int not null,
    name_pet varchar(50) not null default "",
	weight double not null default 0,
    CONSTRAINT pk_pets_id_pet PRIMARY KEY (id_pet),
    CONSTRAINT fk_pets_id_person FOREIGN KEY(id_person) REFERENCES persons(id_person)); 
    
select * from persons;
select * from pets;

select 
		concat(persons.firstname," ",persons.lastname ) as Persons,
        pets.name as Pets
from persons
inner join pets on persons.id_person = pets.id_person; 
    
