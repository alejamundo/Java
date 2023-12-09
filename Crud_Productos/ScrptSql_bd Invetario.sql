create database inventario
use inventario

create table productos(
codigo int primary key,
nombre varchar(100),
precio numeric(2),
existencia int)

insert into productos values(2,'Memoria USB 60 GB',50,20)
select * from productos
