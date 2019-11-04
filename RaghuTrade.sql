create database trade;

use trade;

create table stock(
stockid int primary key,
name varchar(30),
quantity int,
price double,
brokerage int);

insert into stock values
(1,'laptop',10,20000,5),
(2,'mouse',20,500,5),
(3,'keyboard',15,1000,5),
(4,'mobile',20,10000,5),
(5,'printer',30,3000,5);

create table buy(
buy_id int primary key auto_increment,
user_name varchar(20),
stock_name varchar(20),
quantity int,
price double,
brokerage int,
total_price double
);

select *from buy;
select *from stock;
insert into buy values
(1,'Sri','mobile',2,10000,5,20000),
(2,'Keerthi','mouse',2,500,5,1000);

drop table buy;