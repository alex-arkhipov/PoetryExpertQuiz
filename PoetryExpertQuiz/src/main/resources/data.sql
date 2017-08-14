INSERT INTO Authors (FullName, FName, MName, LName, BYear, DYear, Sex) VALUES ('Александр Сергеевич Пушкин', 'Александр', 'Сергеевич', 'Пушкин', 1799, 1836, 1);
INSERT INTO Authors (FullName, FName, MName, LName, BYear, DYear, Sex) VALUES ('Федор Михайлович Грибоедов', 'Федор', 'Михайлович', 'Достоевский', null, null, 1);
INSERT INTO Authors (FullName, FName, MName, LName, BYear, DYear, Sex) VALUES ('Лев Николаевич Толстой', 'Лев', 'Николаевич', 'Толстой', null, null, 1);

INSERT INTO  stattypes(id, StatTypeName) VALUES (1, 'Unset');
INSERT INTO  stattypes(id, StatTypeName) VALUES (2, 'PlayerStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (3, 'AuthorStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (4, 'TypeStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (5, 'GenreStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (6, 'WorkStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (7, 'WorkTitleStat');
INSERT INTO  stattypes(id, StatTypeName) VALUES (8, 'WorkAuthorStat');

INSERT INTO Types(id, Type) VALUES (1, 'Поэзия');
INSERT INTO Types(id, Type) VALUES (2, 'Проза');
INSERT INTO Types(id, Type) VALUES (3, 'Белый стих');

INSERT INTO genres(id, Genre) VALUES (1, 'Любовная лирика');
INSERT INTO genres(id, Genre) VALUES (2, 'Философская лирика');

INSERT INTO works(AuthorID, TypeID, Title, CYear, GenreID) VALUES (SELECT (id) from Authors where LName = 'Пушкин', 1, 'Памятник', null, 2);
