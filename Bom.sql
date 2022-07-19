CREATE TABLE Bom
(BomId varchar(10) primary key,
Icode varchar(10)
References Item(Icode));