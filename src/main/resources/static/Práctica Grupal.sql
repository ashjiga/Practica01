DROP SCHEMA IF EXISTS practica;
DROP USER IF EXISTS 'usuario_practica'@'%';
CREATE SCHEMA practica;

CREATE USER 'usuario_practica'@'%' IDENTIFIED BY 'la_Clave';

GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'%';
FLUSH PRIVILEGES;

USE practica;

CREATE TABLE arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(100) NOT NULL,
  tipo_flor VARCHAR(50),
  dureza_madera INT,
  ruta_imagen VARCHAR(1024),
  PRIMARY KEY (id_arbol))
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4;
