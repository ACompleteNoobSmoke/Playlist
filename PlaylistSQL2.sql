create database PlaylistSQL2;
use PlaylistSQL2;

create table UserTable(
FirstName varchar(30),
LastName varchar(30),
UserName varchar(30) Primary Key,
PassWord varchar(30),
FavoriteArtist varchar(30)
);

select * from UserTable;
truncate table UserTable;
drop table UserTable;
insert into UserTable values('Boye', 'Uwensuyi', 'Prince Aji', 'Aji', 'Drake');
select UserName from UserTable where UserName = 'Prince Aji';

create table Songs(
UserName varchar(250), 
Song varchar(250),
Artist varchar(250),
AlbumType varchar(20),
Album varchar(250),
Year int,
Genre varchar(40),
FOREIGN KEY(UserName) REFERENCES UserTable(UserName)
);

select * from Songs;
truncate table Songs;
drop table Songs;

insert into Songs values('Prince Aji', 'Drake', 'Nothing Was The Same', 'Tuscan Leather Seat', 2013);

select Songs.UserName, Artist, Album, Song, Year from Songs
INNER JOIN UserTable 
ON UserTable.UserName = Songs.UserName
Where UserTable.UserName = 'Prince Aji';