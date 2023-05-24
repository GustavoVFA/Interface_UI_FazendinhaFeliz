DROP DATABASE IF EXISTS Fazenda;
CREATE DATABASE IF NOT EXISTS Fazenda;
USE Fazenda;



CREATE TABLE Grupos (
	ID_grupo INT NOT NULL AUTO_INCREMENT PRIMARY KEY
);



CREATE TABLE Animais (
 	ID_animal INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 	Idade_animal INT NOT NULL,
 	ID_grupo INT NOT NULL,
 	Peso_animal DECIMAL(5,2) NOT NULL,
 	FOREIGN KEY FK_ani_grupo (ID_grupo) 
 		REFERENCES Grupos(ID_grupo)
);


CREATE TABLE veterinarios (
	ID_vet INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	Nome_vet VARCHAR(20) NOT NULL,
	ID_animal INT NOT NULL,
	ID_grupo INT NOT NULL,
 	FOREIGN KEY FK_vet_ani (ID_animal) 
 		REFERENCES Animais (ID_animal),
 	FOREIGN KEY FK_vet_grupo (ID_grupo) 
 		REFERENCES Grupos (ID_grupo)
);


CREATE TABLE vacinados (
	ID_vacina INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ID_animal INT NOT NULL,
	Vacinado BOOL NOT NULL,
	Data_vacina DATE NOT NULL,
	Tipo_vacina VARCHAR(50) NOT NULL,
	Ocorrencia VARCHAR(60) NOT NULL,
	FOREIGN KEY FK_vac_ani (ID_animal)
		REFERENCES Animais(ID_animal)
);


CREATE TABLE abates (
	ID_abate INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ID_animal INT NOT NULL,
	ID_grupo INT NOT NULL,
	Peso_abate DECIMAL(5.2) NOT NULL,
	FOREIGN KEY FK_aba_ani (ID_animal)
		REFERENCES Animais(ID_animal),
	FOREiGN KEY FK_aba_grupo (ID_grupo)
		REFERENCES Grupos(ID_grupo)
);