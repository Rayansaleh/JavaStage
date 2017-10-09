DROP TABLE IF EXISTS Entreprise cascade; 
DROP TABLE IF EXISTS Salarie cascade; 
DROP TABLE IF EXISTS Ouvrier; 
DROP TABLE IF EXISTS Manager;


CREATE TABLE if not exists Entreprise (
	id_entreprise	INTEGER		PRIMARY KEY,
	nom		VARCHAR(30),
	chiffre_affaire	REAL
);


CREATE TABLE if not exists Salarie (
	id_salarie	INTEGER		PRIMARY KEY,
	id_entreprise	INTEGER		REFERENCES Entreprise (id_entreprise),
	nom		VARCHAR(30)
);


CREATE TABLE if not exists Ouvrier (
	id_ouvrier	INTEGER		PRIMARY KEY,
	id_salarie	INTEGER		REFERENCES Salarie (id_salarie),
	heure_travail	INTEGER,
	salaire_ouvrier	REAL
);

CREATE TABLE if not exists Manager (
	id_manager	INTEGER		PRIMARY KEY,
	id_salarie	INTEGER		REFERENCES Salarie (id_salarie),
	salaire_manager	REAL
);


INSERT INTO Entreprise (id_entreprise, nom, chiffre_affaire) VALUES
	(1, 'Ebiznext', 3265.91);

INSERT INTO Salarie (id_salarie, id_entreprise, nom) VALUES
	(1, 1, 'Rayan'),
	(2, 1, 'Farid'),
	(3, 1, 'Celine'),
	(4, 1, 'Jaafar'),
	(5, 1, 'Nadine'),
	(6, 1, 'Hayssam');

INSERT INTO Ouvrier (id_ouvrier, id_salarie, heure_travail, salaire_ouvrier) VAlUES
	(1, 1, 20, 360.0),
	(2, 2, 30, 540.0),
	(3, 3, 35, 630.0),
	(4, 4, 23, 414.0);

INSERT INTO Manager (id_manager, id_salarie, salaire_manager) VALUES
	(1, 5, 561.6),
	(2, 6, 216.0);

SELECT * FROM Entreprise;
SELECT * FROM Salarie;
SELECT * FROM Ouvrier;
SELECT * FROM Manager;
