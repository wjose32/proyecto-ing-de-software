-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         10.2.12-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para baseferreteria
CREATE DATABASE IF NOT EXISTS `baseferreteria` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `baseferreteria`;

-- Volcando estructura para tabla baseferreteria.cambiostock
CREATE TABLE IF NOT EXISTS `cambiostock` (
  `codigo` int(10) unsigned NOT NULL,
  `codigoProducto` varchar(10) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `tipo` varchar(8) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla baseferreteria.cambiostock: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `cambiostock` DISABLE KEYS */;
INSERT INTO `cambiostock` (`codigo`, `codigoProducto`, `cantidad`, `tipo`, `fecha`) VALUES
	(1, 'SAJ09', 600, 'Compra', '2019-07-09'),
	(2, 'SAJ09', 500, 'Compra', '2019-07-09'),
	(3, 'SAJ09', 550, 'Compra', '2019-07-09'),
	(4, 'SAJ09', 200, 'Venta', '2019-07-09');
/*!40000 ALTER TABLE `cambiostock` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `codigo` varchar(4) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla baseferreteria.categoria: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`codigo`, `nombre`) VALUES
	('CA25', 'CARPINTERIA'),
	('HO00', 'HOGAR'),
	('JA00', 'JARDINERIA');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `nit` int(11) unsigned NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla baseferreteria.clientes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.marca
CREATE TABLE IF NOT EXISTS `marca` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla baseferreteria.marca: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`codigo`, `nombre`) VALUES
	('AC44', 'ACE'),
	('Tr72', 'TRUPPER'),
	('TR86', 'TRUPPER');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `categoria` varchar(40) DEFAULT NULL,
  `proveedor` varchar(40) DEFAULT NULL,
  `cantidad` int(11) unsigned DEFAULT NULL,
  `estado` varchar(40) DEFAULT NULL,
  `precio` float unsigned DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla baseferreteria.producto: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`codigo`, `nombre`, `marca`, `categoria`, `proveedor`, `cantidad`, `estado`, `precio`) VALUES
	('MII23', 'mario', 'Invitado', 'Item 1', 'Item 2', 456, 'En Stock', 45.98),
	('SAJ09', 'sierra', 'ACE', 'CARPINTERIA', 'Julio', 400, 'En Stock', 30.5);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.proveedores
CREATE TABLE IF NOT EXISTS `proveedores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla baseferreteria.proveedores: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` (`id`, `nombre`, `direccion`, `telefono`, `email`) VALUES
	(1, 'Julio', 'xela', '54413433', 'dbfgyddffg'),
	(2, 'dgedsvvd', 'gdfg444', '354322', 'vhxnd'),
	(3, 'fgcbgd', 'rhggv', '54444', 'fxvvvcc');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;

-- Volcando estructura para tabla baseferreteria.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `usuario` varchar(15) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `NuevoUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla baseferreteria.usuario: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`usuario`, `nombre`, `apellido`, `direccion`, `telefono`, `email`, `pass`, `tipo`, `NuevoUsuario`) VALUES
	('mgarcia', 'mario', 'garcia', 'xela', '12345678', 'maga@gmail.com', 'aYrWIYLZ8G', 1, 1),
	('zgarcia70', 'zario', 'garcia', 'xela', '12345678', 'maga@gmail.com', 'iynjXCTBfn', 2, 1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
