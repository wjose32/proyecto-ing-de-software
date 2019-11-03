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

-- Volcando datos para la tabla baseferreteria.cambiostock: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `cambiostock` DISABLE KEYS */;
INSERT INTO `cambiostock` (`codigo`, `codigoProducto`, `cantidad`, `tipo`, `fecha`) VALUES
	(1, 'SAJ09', 600, 'Compra', '2019-07-09'),
	(2, 'SAJ09', 500, 'Compra', '2019-07-09'),
	(3, 'SAJ09', 550, 'Compra', '2019-07-09'),
	(4, 'SAJ09', 200, 'Venta', '2019-07-09'),
	(5, 'SAJ09', 90, 'Venta', '2019-07-10'),
	(6, 'SAJ09 ', 60, 'Compra', '2019-07-10'),
	(7, 'SAJ09 ', 200, 'Venta', '2019-07-10'),
	(8, 'SAJ09', 90, 'Venta', '2019-07-10'),
	(9, 'SAJ09', 90, 'Compra', '2019-07-10');
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
INSERT INTO `clientes` (`nit`, `nombre`, `apellido`, `direccion`, `telefono`, `email`) VALUES
	(12345678, 'mario', NULL, 'xela', '12345678', 'maga@gmail.com');
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

-- Volcando datos para la tabla baseferreteria.producto: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`codigo`, `nombre`, `marca`, `categoria`, `proveedor`, `cantidad`, `estado`, `precio`) VALUES
	('MII23', 'mario', 'Invitado', 'Item 1', 'Item 2', 456, 'En Stock', 45.98),
	('MTD68', 'martillo', 'TRUPPER', 'CARPINTERIA', 'dgedsvvd', 90, 'En Stock', 80),
	('SAJ09', 'sierra', 'ACE', 'CARPINTERIA', 'Julio', 170, 'En Stock', 30.5),
	('STD51', 'sierra', 'TRUPPER', 'HOGAR', 'dgedsvvd', 12, 'En Stock', 2);
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

-- Volcando datos para la tabla baseferreteria.usuario: ~19 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`usuario`, `nombre`, `apellido`, `direccion`, `telefono`, `email`, `pass`, `tipo`, `NuevoUsuario`) VALUES
	('aadmin98', 'admin gonzalo', 'admin gonzales', 'admin', '12345678', 'xxx.xxx@xxx.xxx', 'admin', 1, 0),
	('admin66', 'a', 'dmin', 'xela', '87654321', 'fjsfkljskldfj', 'sf2xP4wzkt', 1, 1),
	('alv01', 'mario gonzalo', 'alvarez juarez', 'sdfjsdlkfjasdlkj', '23441234', 'sfsjdlkafjaslkdfaslf', 'evsP1jrV1g', 0, 1),
	('czapet34', 'Cesar Aldair', 'Zapet', 'San Marcos', '12348765', 'tikiman', 'AzB8psuzaM', 0, 1),
	('jjuarez75', 'julio mario', 'juarez', 'sdfsdklj', '89789789', 'sdjflksjl', 'HYHo8G3eKB', 0, 1),
	('jmon27', 'Julio Najera', 'monzon monzon', 'sdfksdjhfjk23479', '2834789', 'sdkfskdjfhs', 'qA5vf0hhvw', 0, 1),
	('jnaj43', 'Julio', 'Najera', 'sdfsldkfj', '34234234', 'sdfsdfsdf', 'e516f979536994a14d9b0500bca3a1287b9ea9fe', 1, 0),
	('julio08', 'j', 'ulio', 'mario', '48230948', 'dsfskljfsd', 'fmQTxrAqUN', 0, 1),
	('jzar89', 'Jose manual', 'zaragoza juqui', 'fsdafjksdlfj', '78979878', 'sdfkjsdlkfjsd', 'Ic5NZScRPx', 0, 1),
	('kleo28', 'Kheysser', 'Leon', 'San Marcos', '87654321', 'Kheysser@gmail.com', '5075089bae6ba6b3cbce9f6823025841249290be', 1, 1),
	('mario95', 'm', 'ario', 'sdflkfjsklq', '89798789', 'jlkjklj', 'z18GAvblgo', 0, 1),
	('mgar50', 'Mario Rodolfo', 'Garcia Tzul', 'sdklfjslakdjflkasj', '98789789', 'sldfjskldfjskldfjs', 'y70lBwHUVb', 0, 1),
	('mgar82', 'Mario Rodolfo', 'Garcia Tzul', 'gfsdfsdfsdf', '34234234', 'gdfgdfgdf', 'B50FmX1Yp7', 0, 1),
	('mgon49', 'mario gonzalo', 'gonzales gonzales', 'quetzaltenango', '87987897', 'kdfjskldfjlks', '7n09W753LO', 0, 1),
	('mjua40', 'mario gonzalo', 'juarez alvarez', 'sdfjsdlk', '97987987', 'sdfjskldjfsldkfjs', 'yCQORb1qAD', 1, 1),
	('nmbnm26', 'nmnnmnm', 'mbnm', 'mbnmgh8658768n  ', '76878678', 'bnmbnmbnm', 'zWTucniljU', 0, 1),
	('pvel25', 'Pedro', 'Velasquez', 'Quetzaltenango', '12345678', 'peterpan@gmail.com', 'e94815b80f6c34e909bbabb3e6545ca2079b6c0d', 1, 1),
	('zgarcia11', 'zario', 'garcia', 'xela', '12345678', 'maga@gmail.com', 'RvsNPVmZOB', 1, 1),
	('zgarcia70', 'zario', 'garcia', 'xela', '12345678', 'maga@gmail.com', 'iynjXCTBfn', 2, 1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
