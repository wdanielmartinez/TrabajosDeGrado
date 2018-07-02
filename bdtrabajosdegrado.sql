-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 02-07-2018 a las 02:07:32
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdtrabajosdegrado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asesores`
--

CREATE TABLE IF NOT EXISTS `asesores` (
  `idAsesor` int(11) NOT NULL AUTO_INCREMENT,
  `apellidosAsesor` varchar(45) NOT NULL,
  `nombreAsesor` varchar(45) NOT NULL,
  `idTesis` int(11) NOT NULL,
  PRIMARY KEY (`idAsesor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

CREATE TABLE IF NOT EXISTS `carreras` (
  `codCarrera` varchar(6) NOT NULL,
  `carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`codCarrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carreras`
--

INSERT INTO `carreras` (`codCarrera`, `carrera`) VALUES
('A30507', 'Arquitectura'),
('I30501', 'Ingenieria Civil'),
('I30502', 'Ingenieria Industrial'),
('I30515', 'Ingeniería de Sistemas Informáticos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directores`
--

CREATE TABLE IF NOT EXISTS `directores` (
  `idDirector` int(11) NOT NULL AUTO_INCREMENT,
  `apellidosDirector` varchar(25) NOT NULL,
  `nombreDirector` varchar(25) NOT NULL,
  PRIMARY KEY (`idDirector`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE IF NOT EXISTS `estudiantes` (
  `carnet` varchar(7) NOT NULL,
  `apellidosEstudiante` varchar(25) NOT NULL,
  `nombreEstudiante` varchar(25) NOT NULL,
  `codCarrera` varchar(6) NOT NULL,
  `idTesis` int(11) NOT NULL,
  `direccionEstudiante` varchar(150) NOT NULL,
  `anioIngreso` year(4) NOT NULL,
  `anioEgreso` year(4) NOT NULL,
  `telEstudiante` int(8) NOT NULL,
  `planEstudios` int(4) NOT NULL,
  `unidadesValorativas` int(3) NOT NULL,
  PRIMARY KEY (`carnet`),
  KEY `codCarrera` (`codCarrera`),
  KEY `idTesis` (`idTesis`),
  KEY `idTesis_2` (`idTesis`),
  KEY `codCarrera_2` (`codCarrera`),
  KEY `idTesis_3` (`idTesis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tesis`
--

CREATE TABLE IF NOT EXISTS `tesis` (
  `idTesis` int(3) NOT NULL AUTO_INCREMENT,
  `temaTesis` varchar(150) NOT NULL,
  `fechaInicio` date NOT NULL,
  `duracion` varchar(15) NOT NULL,
  `ciclo` varchar(2) NOT NULL,
  `año` year(4) NOT NULL,
  `lugarTesis` varchar(45) NOT NULL,
  `telTesis` int(8) NOT NULL,
  `idAsesor` int(11) NOT NULL,
  PRIMARY KEY (`idTesis`),
  KEY `telTesis` (`telTesis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(15) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `usuario`, `contraseña`) VALUES
(1, 'admin', '@dm1n');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
