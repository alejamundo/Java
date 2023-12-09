create database inscripcion_cursos
use inscripcion_cursos

create table curso(
id_curso int primary key identity,
descripcion varchar(200),
precio numeric(5) )

create table forma_pago(
id_forma_pago int primary key identity,
descripcion varchar(200),
recarga numeric(5))

create table inscripcion(
id_inscripcion int primary key identity,
nombre varchar(100),
telefono varchar(20),
id_curso int,
id_forma_pago int
foreign key (id_curso) references curso(id_curso),
foreign key (id_forma_pago) references forma_pago(id_forma_pago))

select * from curso
update curso set descripcion='Java Enterprise (JEE)' where id_curso=1

select * from forma_pago

insert into curso values('Java Enterprise (JEE)',150)
insert into curso values('Java Aplicaction (JSE)',100)
insert into curso values('JUnit (Java)',200)

insert into forma_pago values('Tarjeta de crédito (1 pago)',null)

select * from inscripcion