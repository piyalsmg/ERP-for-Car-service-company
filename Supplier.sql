CREATE TABLE Supplier
(SupplierID varchar(10) Primary Key,
SupplierName varchar(15),
MatID varchar(10)
References Material(MatID));