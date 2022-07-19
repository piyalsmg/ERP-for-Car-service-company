CREATE TABLE Component
(ComID varchar(10) Primary Key,
ComName varchar(15),
Icode varchar(10)
References Item(Icode));