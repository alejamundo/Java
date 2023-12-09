create database trabajadores

use trabajadores

create table departamento (
numerod int primary key,
nombred varchar(50),
localidad varchar(50))

create table empleados(
id int primary key,
nombre varchar(50),
numerod int,
foreign key (numerod) references departamento (numerod),
fecha date)