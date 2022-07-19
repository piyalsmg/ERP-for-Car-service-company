CREATE TABLE Material
(MatID varchar(10) Primary Key,
MatName varchar(15),
Price varchar(10),
ComID varchar(10),
SQty varchar(10)
References Component(ComID));