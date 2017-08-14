DROP TABLE IF EXISTS authors;
CREATE TABLE Authors (id int primary key auto_increment, FullName varchar(100) not null, FName varchar(100) not null, MName varchar(100) not null, LName varchar(100) not null, BYear int, DYear int, Sex tinyint not null);

DROP TABLE IF EXISTS types;
CREATE TABLE Types (id int primary key auto_increment, Type varchar(100));

DROP TABLE IF EXISTS genres;
CREATE TABLE Genres (id int primary key auto_increment, Genre varchar(100));

DROP TABLE IF EXISTS works;
CREATE TABLE Works (id int primary key auto_increment, AuthorID int not null, TypeID int not null, Title varchar(255) not null, CreationYear int, GenreID int);
ALTER TABLE Works ADD FOREIGN KEY (AuthorID) REFERENCES Authors(id);
ALTER TABLE Works ADD FOREIGN KEY (TypeID) REFERENCES Types(id);
ALTER TABLE Works ADD FOREIGN KEY (GenreID) REFERENCES Genres(id);

DROP TABLE IF EXISTS texts;
CREATE TABLE Texts (WorksID int primary key not null, Text text not null);
ALTER TABLE Texts ADD FOREIGN KEY (WorksID) REFERENCES Works(id);

DROP TABLE IF EXISTS players;
CREATE TABLE Players (id int primary key auto_increment, Nickname varchar(20) not null, Name varchar(255) not null, Sex tinyint not null, Hash varchar(100) not null, Age int, LastAccess datetime, Scores int, Email varchar(100) not null);

DROP TABLE IF EXISTS stattypes;
CREATE TABLE stattypes (id int primary key, StatTypeName varchar (50));

DROP TABLE IF EXISTS stats;
CREATE TABLE stats (id int primary key auto_increment, StatTypeID int not null, PlayerID int not null, ItemID int not null, Played int, Correct int); 
ALTER TABLE stats ADD FOREIGN KEY (StatTypeID) REFERENCES stattypes(id);
ALTER TABLE stats ADD FOREIGN KEY (PlayerID) REFERENCES players(id);
