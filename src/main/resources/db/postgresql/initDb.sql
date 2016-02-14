CREATE DATABASE kickstarterDb;

GRANT ALL privileges ON DATABASE kickstarterDb TO postgres;

CREATE TABLE Roles
(
  Id SERIAL,
  RoleName character varying(45),
  CONSTRAINT PK_Roles PRIMARY KEY (Id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE Roles
  OWNER TO postgres;

INSERT INTO Roles (Id, RoleName) VALUES (1, 'User');
INSERT INTO Roles (Id, RoleName) VALUES (2, 'Administrator');

SELECT  setval('Roles_Id_seq', (SELECT MAX(Id) FROM Roles));



CREATE TABLE AppUsers
(
  Id SERIAL,
  Email character varying(45) NOT NULL,
  FirstName character varying(45) NOT NULL,
  LastName character varying(45) NOT NULL,
  Password character varying(45) NOT NULL,
  Salt character varying(45) NOT NULL,
  UserName character varying(45) NOT NULL,
  RoleId integer NOT NULL DEFAULT 1,
  CONSTRAINT PK_AppUsers PRIMARY KEY (Id),
  CONSTRAINT FK_AppUserRole FOREIGN KEY (RoleId)
      REFERENCES Roles (Id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE AppUsers
  OWNER TO postgres;