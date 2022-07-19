CREATE TABLE OrderPlace
(OrderNo varchar(10) primary key,
Description varchar(15),
OrDate varchar(30),
DeDate varchar(30),
Cusid varchar(10)
References Customer(CusID));