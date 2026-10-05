
-- =========================================================
-- SPEEDFAST - SEMANA 8
-- PROGRAMACION ORIENTADA A OBJETOS II
-- Autor: Sergio Sandoval Valenzuela
-- =========================================================

-- 1. Crear la base de datos de Semana 8.
CREATE DATABASE IF NOT EXISTS speedfast_semana8_db;

-- 2. Seleccionar la base de datos.
USE speedfast_semana8_db;

-- 3. Crear la tabla de repartidores.
CREATE TABLE repartidores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- 4. Crear la tabla de pedidos.
CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(200) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL
);

-- 5. Crear la tabla de entregas.
CREATE TABLE entregas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_repartidor INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,

    -- Relacionar la entrega con un pedido existente.
    CONSTRAINT fk_entrega_pedido
        FOREIGN KEY (id_pedido)
        REFERENCES pedidos(id),

    -- Relacionar la entrega con un repartidor existente.
    CONSTRAINT fk_entrega_repartidor
        FOREIGN KEY (id_repartidor)
        REFERENCES repartidores(id)
);

-- 6. Verificar las tablas creadas.
SHOW TABLES;

-- 7. Verificar la estructura de repartidores.
DESCRIBE repartidores;

-- 8. Verificar la estructura de pedidos.
DESCRIBE pedidos;

-- 9. Verificar la estructura de entregas.
DESCRIBE entregas;

-- 10. Verificar las claves foraneas.
SHOW CREATE TABLE entregas;

-- 11. Consultar los repartidores registrados.
SELECT id, nombre
FROM repartidores
ORDER BY id;

-- 12. Consultar los pedidos registrados.
SELECT id, direccion, tipo, estado
FROM pedidos
ORDER BY id;

-- 13. Consultar las entregas registradas.
SELECT id, id_pedido, id_repartidor, fecha, hora
FROM entregas
ORDER BY id;

-- 14. Verificar la relacion entre entregas, pedidos y repartidores.
SELECT
    e.id AS id_entrega,
    p.id AS id_pedido,
    p.direccion,
    p.estado,
    r.id AS id_repartidor,
    r.nombre AS repartidor,
    e.fecha,
    e.hora
FROM entregas e
INNER JOIN pedidos p
    ON e.id_pedido = p.id
INNER JOIN repartidores r
    ON e.id_repartidor = r.id
ORDER BY e.id;

-- 15. Verificar que no existan pedidos entregados sin registro de entrega.
SELECT
    p.id,
    p.direccion,
    p.estado
FROM pedidos p
LEFT JOIN entregas e
    ON p.id = e.id_pedido
WHERE p.estado = 'ENTREGADO'
    AND e.id IS NULL;

-- 16. Verificar la cantidad de registros de cada tabla.
SELECT
    (SELECT COUNT(*) FROM repartidores) AS repartidores,
    (SELECT COUNT(*) FROM pedidos) AS pedidos,
    (SELECT COUNT(*) FROM entregas) AS entregas;





