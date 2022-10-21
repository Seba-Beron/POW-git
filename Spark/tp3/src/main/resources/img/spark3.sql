CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int NOT NULL,
  `email` varchar(30) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `jugador` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `posicion` VARCHAR(45) NULL,
  `fechaNacimiento` VARCHAR(45) NULL,
  `equipo_idEquipo` INT NOT NULL,
  PRIMARY KEY (`id`, `equipo_idEquipo`),
  INDEX `fk_jugador_equipo_idx` (`equipo_idEquipo` ASC) VISIBLE,
  CONSTRAINT `fk_jugador_equipo`
    FOREIGN KEY (`equipo_idEquipo`)
    REFERENCES `spark3`.`equipo` (`idEquipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `equipo` (
  `idEquipo` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idEquipo`));

INSERT INTO `usuario` (`id`, `email`, `pass`) VALUES
(1, 'admin@gmail.com', 'admin');

INSERT INTO `equipo` (`idEquipo`, `nombre`) VALUES
(1, 'Loxston FC');

INSERT INTO `jugador` (`id`, `nombre`, `posicion`, `fechaNacimiento`,`equipo_idEquipo`) VALUES
(7, 'Juli', 'defensa', '15/07/2001',1);