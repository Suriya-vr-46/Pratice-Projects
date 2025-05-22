-- #Database 
create database INV_Management;
exec sp_databases;
use INV_Management;


-- #User table 
drop table if exists USERS;
create table USERS(
	id int primary key identity(1000,1),
    name varchar(20),
    password varchar(20),
	created_at datetime default getdate(),
	created_by varchar(20),
	updated_at datetime,
	updated_by varchar(20),
	void_flag bit default 0
);
sp_help USERS;
insert into USERS(name,password,created_by,updated_by) values('admin','admin@123','admin','admin');
select * from USERS;




-- #Part table 
drop table if exists PART;
create table PART(
	id int primary key identity(1000,1),
    name varchar(20),
    number varchar(20),
    quantity int,
    description varchar(20),
	created_at datetime default getdate(),
	created_by varchar(20),
	updated_at datetime,
	updated_by varchar(20),
	void_flag bit default 0
);
sp_help PART;
select * from PART;


-- #Parts table 
drop table if exists PARTS;
create table PARTS(
	id int primary key identity(3000,1),
    name varchar(20),
    number varchar(20),
	description varchar(20),
	created_at datetime default getdate(),
	created_by varchar(20),
	updated_at datetime,
	updated_by varchar(20),
	void_flag bit default 0
);
sp_help PARTS;
select * from PARTS;
select * from PARTS where id = 3012;
select * from PARTS where void_flag = 0;
update PARTS set void_flag = 1 where id = 3012;
select top 5 id from PARTS;


-- #Address table 
drop table if exists ADDRESS;
create table ADDRESS(
	id int primary key identity(1,1),
    doorno varchar(20),
    street varchar(20),
    district varchar(20),
    country varchar(20),
	created_at datetime default getdate(),
	created_by varchar(20),
	updated_at datetime,
	updated_by varchar(20),
	void_flag bit default 0
);
sp_help ADDRESS;
select * from ADDRESS;
truncate table ADDRESS;


-- #Orders table 
drop table if exists SHIPMENT;
create table SHIPMENT(
	id int primary key identity(1,1),
	parts_id varchar(100),
	address_id int,
		foreign key(address_id) references ADDRESS(id),
	quantity int,
	tag_numbers varchar(100),
	created_at datetime default getdate(),
	created_by varchar(20),
	updated_at datetime,
	updated_by varchar(20),
	void_flag bit default 0 
);
sp_help SHIPMENT;
select * from SHIPMENT;


-- Group by
select 
	p.id,
	p.number,
	p.name,
	p.description,
	STRING_AGG(t.id,',') AS tags
from
	PART p
left join PARTS t on
	p.name = t.name
where t.void_flag = 0
and p.id = 1001
group by 
	p.id,
	p.number,
	p.name,
	p.description;
