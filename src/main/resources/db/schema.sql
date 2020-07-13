create table counter
(
	id serial
		constraint counter_pk
			primary key,
	name varchar(50),
	value int
);

insert into counter(name, value) values('webservice', 0);