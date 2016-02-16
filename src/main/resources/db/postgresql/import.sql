/*
  It works only when <prop key="hibernate.hbm2ddl.auto">create</prop>
*/

INSERT INTO Roles (Id, RoleName) VALUES (1, 'User');
INSERT INTO Roles (Id, RoleName) VALUES (2, 'Administrator');

SELECT  setval('Roles_Id_seq', (SELECT MAX(Id) FROM Roles));


INSERT INTO AppUsers (Email, Password, Salt, UserName, RoleId) VALUES ('admin@ks.com', 'a665937d971a3ecebf5729222962e4aa8949b5fb', '[B@2bfbac38', 'admin', 2);
INSERT INTO AppUsers (Email, Password, Salt, UserName, RoleId) VALUES ('user@ks.com', 'a665937d971a3ecebf5729222962e4aa8949b5fb', '[B@2bfbac38', 'user', 1);