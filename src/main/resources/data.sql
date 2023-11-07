-- Elimina las tablas si existen
DROP TABLE IF EXISTS `Salas`;
DROP TABLE IF EXISTS `Peliculas`;


-- Crea la tabla `Peliculas`
CREATE TABLE `Peliculas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `edad` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- Crea la tabla `Salas`
CREATE TABLE `Salas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `pelicula` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `peliculas_fk` FOREIGN KEY (`pelicula`) REFERENCES `Peliculas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Inserta datos en la tabla `Peliculas`
INSERT INTO `Peliculas` (nombre, edad) VALUES
('Pelicula 1', 12),
('Pelicula 2', 16),
('Pelicula 3', 18),
('Pelicula 4', 14),
('Pelicula 5', 10);

-- Inserta datos en la tabla `Salas`
INSERT INTO `Salas` (nombre, pelicula) VALUES
('Sala 1', 1),
('Sala 2', 2),
('Sala 3', 3),
('Sala 4', 4),
('Sala 5', 5);








