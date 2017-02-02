-- MySQL dump 10.16  Distrib 10.1.21-MariaDB, for osx10.12 (x86_64)
--
-- Host: nomina    Database: nomina
-- ------------------------------------------------------
-- Server version	10.1.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `nomina_accionesotitulos`
--

DROP TABLE IF EXISTS `nomina_accionesotitulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_accionesotitulos` (
  `idAccionesotitulos` bigint(20) DEFAULT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `valorMercado` decimal(18,2) DEFAULT NULL,
  `precioAlOtorgarse` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_accionesotitulos`
--

LOCK TABLES `nomina_accionesotitulos` WRITE;
/*!40000 ALTER TABLE `nomina_accionesotitulos` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_accionesotitulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_compensacionsaldosafavor`
--

DROP TABLE IF EXISTS `nomina_compensacionsaldosafavor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_compensacionsaldosafavor` (
  `idCompensacion` bigint(20) DEFAULT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `saldoAFavor` decimal(18,2) DEFAULT NULL,
  `ano` int(11) DEFAULT NULL,
  `remanenteSalFav` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_compensacionsaldosafavor`
--

LOCK TABLES `nomina_compensacionsaldosafavor` WRITE;
/*!40000 ALTER TABLE `nomina_compensacionsaldosafavor` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_compensacionsaldosafavor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_comprobante`
--

DROP TABLE IF EXISTS `nomina_comprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_comprobante` (
  `idComprobante` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` char(3) DEFAULT NULL,
  `serie` varchar(25) DEFAULT NULL,
  `folio` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `sello` varchar(500) DEFAULT NULL,
  `formaDePago` char(22) DEFAULT NULL,
  `noCertificado` char(20) DEFAULT NULL,
  `certificado` varchar(350) DEFAULT NULL,
  `subTotal` decimal(18,2) DEFAULT NULL,
  `descuento` decimal(18,2) DEFAULT NULL,
  `tipoCambio` smallint(6) DEFAULT NULL,
  `moneda` char(3) DEFAULT NULL,
  `total` decimal(18,2) DEFAULT NULL,
  `tipoDeComprobante` char(6) DEFAULT NULL,
  `metodoDePago` char(2) DEFAULT NULL,
  `lugarExpedicion` char(5) DEFAULT NULL,
  `agrupa` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idComprobante`),
  UNIQUE KEY `nomina_comprobante_idComprobante_uindex` (`idComprobante`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_comprobante`
--

LOCK TABLES `nomina_comprobante` WRITE;
/*!40000 ALTER TABLE `nomina_comprobante` DISABLE KEYS */;
INSERT INTO `nomina_comprobante` VALUES (1,'3.2',NULL,NULL,'2017-02-02 10:35:45',NULL,'En una sola exhibición',NULL,NULL,100.00,1.00,1,'MXN',9.00,'egreso','NA','98000',1),(2,'3.2',NULL,NULL,'2017-02-01 10:37:45',NULL,NULL,NULL,NULL,11.00,2.00,1,'MXN',9.00,'egreso','NA','98000',1);
/*!40000 ALTER TABLE `nomina_comprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_deduccion`
--

DROP TABLE IF EXISTS `nomina_deduccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_deduccion` (
  `idDeduccion` bigint(20) DEFAULT NULL,
  `idDeducciones` bigint(20) DEFAULT NULL,
  `tipoDeduccion` char(3) DEFAULT NULL,
  `clave` char(15) DEFAULT NULL,
  `concepto` char(100) DEFAULT NULL,
  `importe` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_deduccion`
--

LOCK TABLES `nomina_deduccion` WRITE;
/*!40000 ALTER TABLE `nomina_deduccion` DISABLE KEYS */;
INSERT INTO `nomina_deduccion` VALUES (NULL,1,'002','DED','ISR',1.00),(NULL,2,'002','DED','ISR',1.00);
/*!40000 ALTER TABLE `nomina_deduccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_deducciones`
--

DROP TABLE IF EXISTS `nomina_deducciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_deducciones` (
  `idDeducciones` bigint(20) NOT NULL AUTO_INCREMENT,
  `idNomina` bigint(20) DEFAULT NULL,
  `totalOtrasDeducciones` decimal(18,2) DEFAULT NULL,
  `totalImpuestosRetenidos` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idDeducciones`),
  UNIQUE KEY `nomina_deducciones_idDeducciones_uindex` (`idDeducciones`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_deducciones`
--

LOCK TABLES `nomina_deducciones` WRITE;
/*!40000 ALTER TABLE `nomina_deducciones` DISABLE KEYS */;
INSERT INTO `nomina_deducciones` VALUES (1,1,0.00,1.00),(2,2,0.00,2.00);
/*!40000 ALTER TABLE `nomina_deducciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_emisor`
--

DROP TABLE IF EXISTS `nomina_emisor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_emisor` (
  `idEmisor` int(11) NOT NULL AUTO_INCREMENT,
  `rfc` char(12) DEFAULT NULL,
  `nombre` char(80) DEFAULT NULL,
  `registroPatronal` char(20) DEFAULT NULL,
  `rfcPatronOrigen` char(12) DEFAULT NULL,
  `regimenFiscal` char(3) DEFAULT NULL,
  `activo` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`idEmisor`),
  UNIQUE KEY `nomina_emisor_idEmisor_uindex` (`idEmisor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_emisor`
--

LOCK TABLES `nomina_emisor` WRITE;
/*!40000 ALTER TABLE `nomina_emisor` DISABLE KEYS */;
INSERT INTO `nomina_emisor` VALUES (1,'TGF680906TR$','EMPRESA VIP','5525665412',NULL,'603',1);
/*!40000 ALTER TABLE `nomina_emisor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_entidadsnfc`
--

DROP TABLE IF EXISTS `nomina_entidadsnfc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_entidadsnfc` (
  `idEntidadSnfc` bigint(20) DEFAULT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `origenRecurso` char(2) DEFAULT NULL,
  `montoRecursoPropio` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_entidadsnfc`
--

LOCK TABLES `nomina_entidadsnfc` WRITE;
/*!40000 ALTER TABLE `nomina_entidadsnfc` DISABLE KEYS */;
INSERT INTO `nomina_entidadsnfc` VALUES (NULL,1,'IM',10.00),(NULL,2,'IP',NULL);
/*!40000 ALTER TABLE `nomina_entidadsnfc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_horasextra`
--

DROP TABLE IF EXISTS `nomina_horasextra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_horasextra` (
  `idHorasExtra` bigint(20) NOT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `dias` int(11) DEFAULT NULL,
  `tipoHoras` char(2) DEFAULT NULL,
  `horasExtra` int(11) DEFAULT NULL,
  `importePagado` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idHorasExtra`),
  UNIQUE KEY `nomina_horasextra_idHorasExtra_uindex` (`idHorasExtra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_horasextra`
--

LOCK TABLES `nomina_horasextra` WRITE;
/*!40000 ALTER TABLE `nomina_horasextra` DISABLE KEYS */;
INSERT INTO `nomina_horasextra` VALUES (1,1,12,'01',10,100.00);
/*!40000 ALTER TABLE `nomina_horasextra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_incapacidad`
--

DROP TABLE IF EXISTS `nomina_incapacidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_incapacidad` (
  `idIncapacidad` bigint(20) DEFAULT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `diasIncapacidad` int(11) DEFAULT NULL,
  `tipoIncapacidad` char(2) DEFAULT NULL,
  `importeMonetario` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_incapacidad`
--

LOCK TABLES `nomina_incapacidad` WRITE;
/*!40000 ALTER TABLE `nomina_incapacidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_incapacidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_jubilacionpensionretiro`
--

DROP TABLE IF EXISTS `nomina_jubilacionpensionretiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_jubilacionpensionretiro` (
  `idJubilacion` bigint(20) NOT NULL AUTO_INCREMENT,
  `idNomina` bigint(20) DEFAULT NULL,
  `totalUnaExhibicion` decimal(18,2) DEFAULT NULL,
  `totalParcialidad` decimal(18,2) DEFAULT NULL,
  `montoDiario` decimal(18,2) DEFAULT NULL,
  `ingresoAcumulable` decimal(18,2) DEFAULT NULL,
  `ingresoNoAcumulable` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idJubilacion`),
  UNIQUE KEY `nomina_jubilacionpensionretiro_idJubilacion_uindex` (`idJubilacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_jubilacionpensionretiro`
--

LOCK TABLES `nomina_jubilacionpensionretiro` WRITE;
/*!40000 ALTER TABLE `nomina_jubilacionpensionretiro` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_jubilacionpensionretiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_nomina`
--

DROP TABLE IF EXISTS `nomina_nomina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_nomina` (
  `idNomina` bigint(20) NOT NULL AUTO_INCREMENT,
  `idComprobante` bigint(20) DEFAULT NULL,
  `version` char(3) DEFAULT NULL,
  `tipoNomina` char(1) DEFAULT NULL,
  `fechaPago` date DEFAULT NULL,
  `fechaInicialPago` date DEFAULT NULL,
  `fechaFinalPago` date DEFAULT NULL,
  `numDiasPagados` double(3,1) DEFAULT NULL,
  `totalPercepciones` decimal(18,2) DEFAULT NULL,
  `totalDeducciones` decimal(18,2) DEFAULT NULL,
  `totalOtrosPagos` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idNomina`),
  UNIQUE KEY `nomina_nomina_idNomina_uindex` (`idNomina`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_nomina`
--

LOCK TABLES `nomina_nomina` WRITE;
/*!40000 ALTER TABLE `nomina_nomina` DISABLE KEYS */;
INSERT INTO `nomina_nomina` VALUES (1,1,'1.2','O','2017-01-30','2017-01-15','2017-01-30',15.0,10.00,1.00,NULL),(2,2,'1.2','O','2017-01-30','2017-01-15','2017-01-30',15.0,11.00,2.00,NULL);
/*!40000 ALTER TABLE `nomina_nomina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_otropago`
--

DROP TABLE IF EXISTS `nomina_otropago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_otropago` (
  `idOtroPago` bigint(20) DEFAULT NULL,
  `idNomina` bigint(20) DEFAULT NULL,
  `tipoOtroPago` char(3) DEFAULT NULL,
  `clave` char(15) DEFAULT NULL,
  `concepto` char(100) DEFAULT NULL,
  `importe` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_otropago`
--

LOCK TABLES `nomina_otropago` WRITE;
/*!40000 ALTER TABLE `nomina_otropago` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_otropago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_percepcion`
--

DROP TABLE IF EXISTS `nomina_percepcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_percepcion` (
  `idPercepcion` bigint(20) DEFAULT NULL,
  `idPercepciones` bigint(20) DEFAULT NULL,
  `tipoPercepcion` char(3) DEFAULT NULL,
  `clave` char(15) DEFAULT NULL,
  `concepto` char(100) DEFAULT NULL,
  `importeGravado` decimal(18,2) DEFAULT NULL,
  `importeExento` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_percepcion`
--

LOCK TABLES `nomina_percepcion` WRITE;
/*!40000 ALTER TABLE `nomina_percepcion` DISABLE KEYS */;
INSERT INTO `nomina_percepcion` VALUES (NULL,1,'001','SLD','SUELDO',0.00,50.00),(NULL,1,'038','OTR','BONO ACD',0.00,50.00),(NULL,2,'001','SLD','SUELDO',0.00,60.00),(NULL,2,'038','OTR','BONO',0.00,40.00);
/*!40000 ALTER TABLE `nomina_percepcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_percepciones`
--

DROP TABLE IF EXISTS `nomina_percepciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_percepciones` (
  `idPercepciones` bigint(20) NOT NULL AUTO_INCREMENT,
  `idNomina` bigint(20) DEFAULT NULL,
  `totalSueldos` decimal(18,2) DEFAULT NULL,
  `totalSeparacionIndemnizacion` decimal(18,2) DEFAULT NULL,
  `totalJubilacionPensionRetiro` decimal(18,2) DEFAULT NULL,
  `totalGravado` decimal(18,2) DEFAULT NULL,
  `totalExento` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idPercepciones`),
  UNIQUE KEY `nomina_percepciones_idPercepciones_uindex` (`idPercepciones`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_percepciones`
--

LOCK TABLES `nomina_percepciones` WRITE;
/*!40000 ALTER TABLE `nomina_percepciones` DISABLE KEYS */;
INSERT INTO `nomina_percepciones` VALUES (1,1,100.00,NULL,NULL,0.00,100.00),(2,2,100.00,NULL,NULL,0.00,100.00);
/*!40000 ALTER TABLE `nomina_percepciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_receptor`
--

DROP TABLE IF EXISTS `nomina_receptor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_receptor` (
  `idReceptor` bigint(20) NOT NULL AUTO_INCREMENT,
  `idComprobante` bigint(20) DEFAULT NULL,
  `rfc` char(13) DEFAULT NULL,
  `nombre` char(100) DEFAULT NULL,
  `curp` char(18) DEFAULT NULL,
  `numSeguridadSocial` char(15) DEFAULT NULL,
  `fechaInicioRelacionLaboral` date DEFAULT NULL,
  `antiguedad` date DEFAULT NULL,
  `tipoContrato` char(2) DEFAULT NULL,
  `sindicalizado` char(2) DEFAULT NULL,
  `tipoJornada` char(2) DEFAULT NULL,
  `tipoRegimen` char(2) DEFAULT NULL,
  `numEmpleado` char(15) DEFAULT NULL,
  `departamento` char(100) DEFAULT NULL,
  `puesto` char(100) DEFAULT NULL,
  `riesgoPuesto` char(1) DEFAULT NULL,
  `periodicidadPago` char(2) DEFAULT NULL,
  `banco` char(3) DEFAULT NULL,
  `cuentaBancaria` char(18) DEFAULT NULL,
  `salarioBaseCotApor` decimal(18,2) DEFAULT NULL,
  `salarioDiarioIntegrado` decimal(18,2) DEFAULT NULL,
  `claveEntFed` char(3) DEFAULT NULL,
  PRIMARY KEY (`idReceptor`),
  UNIQUE KEY `nomina_receptor_idReceptor_uindex` (`idReceptor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_receptor`
--

LOCK TABLES `nomina_receptor` WRITE;
/*!40000 ALTER TABLE `nomina_receptor` DISABLE KEYS */;
INSERT INTO `nomina_receptor` VALUES (1,1,'YFGH67120176A','RAMON RAMIREZ','MASM020203MDFRNTA6','12345678','2012-08-30','2012-08-30','03','Si','02','03','100','CEII','DOCENTE','1','04','014','4524347700',100.00,100.00,'ZAC'),(2,2,'BEJT94020523B','JUAN PEREZ','MASM020203MDFRNTA6','12345678','2012-08-30','2012-08-30','03','No','02','03','101','RH','ADMINISTRATIVO','1','04','014','1234567891',100.00,100.00,'AGS'),(3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `nomina_receptor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_separacionindemnizacion`
--

DROP TABLE IF EXISTS `nomina_separacionindemnizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_separacionindemnizacion` (
  `idSeparacion` bigint(20) NOT NULL AUTO_INCREMENT,
  `idNomina` bigint(20) DEFAULT NULL,
  `totalPagado` decimal(18,2) DEFAULT NULL,
  `numAnosServicio` int(11) DEFAULT NULL,
  `ultimoSueldoMensOrd` decimal(18,2) DEFAULT NULL,
  `ingresoAcumulable` decimal(18,2) DEFAULT NULL,
  `ingresoNoAcumulable` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idSeparacion`),
  UNIQUE KEY `nomina_separacionindemnizacion_idSeparacion_uindex` (`idSeparacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_separacionindemnizacion`
--

LOCK TABLES `nomina_separacionindemnizacion` WRITE;
/*!40000 ALTER TABLE `nomina_separacionindemnizacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_separacionindemnizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_subcontratacion`
--

DROP TABLE IF EXISTS `nomina_subcontratacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_subcontratacion` (
  `idSubContratacion` bigint(20) NOT NULL AUTO_INCREMENT,
  `idReceptor` bigint(20) DEFAULT NULL,
  `rfcLabora` char(12) DEFAULT NULL,
  `porcentajeTiempo` char(4) DEFAULT NULL,
  PRIMARY KEY (`idSubContratacion`),
  UNIQUE KEY `nomina_subcontratacion_idSubContratacion_uindex` (`idSubContratacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_subcontratacion`
--

LOCK TABLES `nomina_subcontratacion` WRITE;
/*!40000 ALTER TABLE `nomina_subcontratacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_subcontratacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_subsidioalempleo`
--

DROP TABLE IF EXISTS `nomina_subsidioalempleo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nomina_subsidioalempleo` (
  `idSubsidio` bigint(20) NOT NULL AUTO_INCREMENT,
  `idNomina` bigint(20) DEFAULT NULL,
  `subsidioCausado` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idSubsidio`),
  UNIQUE KEY `nomina_subsidioalempleo_idSubsidio_uindex` (`idSubsidio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_subsidioalempleo`
--

LOCK TABLES `nomina_subsidioalempleo` WRITE;
/*!40000 ALTER TABLE `nomina_subsidioalempleo` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_subsidioalempleo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-02 14:08:44
