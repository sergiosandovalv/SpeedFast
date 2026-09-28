-- =========================================================
-- SPEEDFAST
-- Base de datos - Semana 7
-- Autor: Sergio Sandoval Valenzuela
-- =========================================================


-- =========================================================
-- BASE DE DATOS
-- Crea la base de datos utilizada por SpeedFast.
-- =========================================================

CREATE DATABASE IF NOT EXISTS speedfast_db;

-- Selecciona la base de datos utilizada por SpeedFast.
USE speedfast_db;


-- =========================================================
-- TABLA REPARTIDOR
-- Almacena los repartidores disponibles en el sistema.
-- =========================================================

CREATE TABLE repartidor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);


-- =========================================================
-- TABLA PEDIDO
-- Almacena los pedidos registrados por la aplicacion.
-- =========================================================

CREATE TABLE pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(200) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL
);


-- =========================================================
-- TABLA ENTREGA
-- Relaciona un pedido con el repartidor que realiza
-- la entrega y registra su fecha y hora.
-- =========================================================

CREATE TABLE entrega (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_repartidor INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    
    FOREIGN KEY (id_pedido)
        REFERENCES pedido(id),
        
    FOREIGN KEY (id_repartidor)
        REFERENCES repartidor(id)
);


-- =========================================================
-- DATOS INICIALES DE REPARTIDORES
-- Permiten probar la asignacion de entregas en SpeedFast.
-- =========================================================

INSERT INTO repartidor (nombre)
VALUES
    ('Daniel'),
    ('Nicole'),
    ('Jaime');


-- =========================================================
-- CONSULTAS DE VERIFICACION
-- Permiten comprobar los datos almacenados.
-- =========================================================

SELECT * FROM repartidor;

SELECT * FROM pedido;

SELECT * FROM entrega;