-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.24-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.1.0.4946
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para bd_gestionincidencia
CREATE DATABASE IF NOT EXISTS `bd_gestionincidencia` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd_gestionincidencia`;


-- Volcando estructura para tabla bd_gestionincidencia.sequence
CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.sequence: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;
INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
	('SEQ_GEN', 0);
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_categoria
CREATE TABLE IF NOT EXISTS `tb_categoria` (
  `COD_CAT` int(11) NOT NULL AUTO_INCREMENT,
  `DES_CAT` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COD_CAT`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_categoria` DISABLE KEYS */;
INSERT INTO `tb_categoria` (`COD_CAT`, `DES_CAT`) VALUES
	(1, 'ALTA');
/*!40000 ALTER TABLE `tb_categoria` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_estado
CREATE TABLE IF NOT EXISTS `tb_estado` (
  `COD_EST` int(11) NOT NULL AUTO_INCREMENT,
  `DES_EST` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COD_EST`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_estado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_estado` DISABLE KEYS */;
INSERT INTO `tb_estado` (`COD_EST`, `DES_EST`) VALUES
	(1, 'ACTIVO');
/*!40000 ALTER TABLE `tb_estado` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_incidencia
CREATE TABLE IF NOT EXISTS `tb_incidencia` (
  `COD_INC` int(11) NOT NULL AUTO_INCREMENT,
  `CATEGORIA` varchar(50) DEFAULT NULL,
  `RES_INC` varchar(100) DEFAULT NULL,
  `ESTADO` varchar(50) DEFAULT NULL,
  `AREA` varchar(50) DEFAULT NULL,
  `PRIORIDAD` varchar(50) DEFAULT NULL,
  `FEC_REG` datetime DEFAULT CURRENT_TIMESTAMP,
  `FEC_SOL` datetime DEFAULT CURRENT_TIMESTAMP,
  `TITU_INC` varchar(100) DEFAULT NULL,
  `DES_INC` varchar(100) DEFAULT NULL,
  `RUTA_DOC` varchar(100) DEFAULT NULL,
  `USUARIO` varchar(50) DEFAULT NULL,
  `TECNICO` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`COD_INC`),
  KEY `FK_tb_incidencia_tb_categoria` (`CATEGORIA`),
  KEY `FK_tb_incidencia_tb_estado` (`ESTADO`),
  KEY `FK_tb_incidencia_tb_usuarios` (`USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_incidencia: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_incidencia` DISABLE KEYS */;
INSERT INTO `tb_incidencia` (`COD_INC`, `CATEGORIA`, `RES_INC`, `ESTADO`, `AREA`, `PRIORIDAD`, `FEC_REG`, `FEC_SOL`, `TITU_INC`, `DES_INC`, `RUTA_DOC`, `USUARIO`, `TECNICO`) VALUES
	(2, '0', NULL, '0', '0', '0', '2016-10-29 13:49:46', '2016-10-29 13:49:46', NULL, NULL, '0', '0', '0'),
	(3, '1', NULL, '1', '0', '0', '2016-10-25 18:43:23', '2016-10-25 18:43:23', 'TEST', 'DESCRI DE TEST', '0', '1', '0'),
	(5, '0', NULL, '0', '0', '0', NULL, NULL, 'dfsdfsdf', NULL, NULL, '0', '0'),
	(6, '0', NULL, '0', '0', '0', NULL, NULL, 'dfgdfg', NULL, NULL, '0', '0'),
	(7, '0', NULL, '0', '0', '0', NULL, NULL, '', NULL, NULL, '0', '0'),
	(8, 'ALTA', NULL, 'ACTIVO', 'Area1', '2', NULL, NULL, 'sdfsdf', 'sdfsdfsdfsdfsdfsdf', NULL, 'lzambran', NULL),
	(9, 'ALTA', NULL, 'Selecciones Estado', 'Area1', '2', '2016-10-29 15:31:24', NULL, 'asdasd', 'gggggg', NULL, NULL, 'Selecciones Tecnico'),
	(10, 'ALTA', NULL, 'ACTIVO', 'Area2', '2', '2016-10-29 15:56:14', NULL, 'pópfghfghfgh', '796p980p9fgtddftr', NULL, NULL, 'lzambran'),
	(11, 'ALTA', NULL, 'ACTIVO', 'Area1', '2', '2016-10-29 16:34:13', '2016-10-29 15:22:06', 'Test Update', 'sdgfsdfsf', NULL, NULL, 'lzambran');
/*!40000 ALTER TABLE `tb_incidencia` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_platocarta
CREATE TABLE IF NOT EXISTS `tb_platocarta` (
  `ID` bigint(20) NOT NULL,
  `PC_CATEGORIA` varchar(255) DEFAULT NULL,
  `PC_NOM` varchar(255) DEFAULT NULL,
  `PC_PRECIO` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_platocarta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_platocarta` DISABLE KEYS */;
INSERT INTO `tb_platocarta` (`ID`, `PC_CATEGORIA`, `PC_NOM`, `PC_PRECIO`) VALUES
	(1, 'dd', 'dd', 12);
/*!40000 ALTER TABLE `tb_platocarta` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_tipo_usuario
CREATE TABLE IF NOT EXISTS `tb_tipo_usuario` (
  `COD_TIP_USU` int(11) NOT NULL AUTO_INCREMENT,
  `DES_TIPO_USU` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COD_TIP_USU`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_tipo_usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_tipo_usuario` DISABLE KEYS */;
INSERT INTO `tb_tipo_usuario` (`COD_TIP_USU`, `DES_TIPO_USU`) VALUES
	(1, 'ADMINISTRADOR');
/*!40000 ALTER TABLE `tb_tipo_usuario` ENABLE KEYS */;


-- Volcando estructura para tabla bd_gestionincidencia.tb_usuarios
CREATE TABLE IF NOT EXISTS `tb_usuarios` (
  `COD_USU` int(11) NOT NULL AUTO_INCREMENT,
  `USU_USU` varchar(100) NOT NULL,
  `PWD_USU` varchar(100) NOT NULL,
  `NOM_USU` varchar(100) NOT NULL,
  `APE_USU` varchar(100) DEFAULT NULL,
  `COD_TIP` int(11) NOT NULL,
  `CON_TOT` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`COD_USU`),
  UNIQUE KEY `USU_USU` (`USU_USU`),
  KEY `FK_tb_usuarios_tb_tipo_usuario` (`COD_TIP`),
  CONSTRAINT `FK_tb_usuarios_tb_tipo_usuario` FOREIGN KEY (`COD_TIP`) REFERENCES `tb_tipo_usuario` (`COD_TIP_USU`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bd_gestionincidencia.tb_usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tb_usuarios` DISABLE KEYS */;
INSERT INTO `tb_usuarios` (`COD_USU`, `USU_USU`, `PWD_USU`, `NOM_USU`, `APE_USU`, `COD_TIP`, `CON_TOT`) VALUES
	(1, 'lzambran', '123', 'Luis alexis', 'zambrano Sandoval', 1, NULL);
/*!40000 ALTER TABLE `tb_usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
