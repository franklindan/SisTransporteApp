CREATE DATABASE  IF NOT EXISTS `sistranspublic` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sistranspublic`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistranspublic
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `administrador` (
  `dniAdmi` int(11) NOT NULL,
  `nombAdmi` varchar(45) DEFAULT NULL,
  `apelAdmi` varchar(45) DEFAULT NULL,
  `celuAdmi` varchar(45) DEFAULT NULL,
  `coreAdmi` varchar(45) DEFAULT NULL,
  `cuenBancAdmi` varchar(45) DEFAULT NULL,
  `direAdmi` varchar(45) DEFAULT NULL,
  `Usuario_idUsua` int(11) NOT NULL,
  `Usuario_Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`dniAdmi`),
  KEY `fk_Administrador_Usuario1_idx` (`Usuario_idUsua`,`Usuario_Transporte_idTran`),
  KEY `fk_Administrador_Usuario1` (`Usuario_Transporte_idTran`),
  CONSTRAINT `fk_Administrador_Usuario1` FOREIGN KEY (`Usuario_Transporte_idTran`) REFERENCES `usuario` (`Transporte_idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (72680374,'SDA','SAD','985','ASDA','NULL','NULL',72680374,1),(72680375,'Daniel','Carba','ASD','ASDA','ASD','ASD',72680375,1),(72680394,'Franklin','Osis','985655','sa','NULL','NULL',72680394,1);
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ayudante`
--

DROP TABLE IF EXISTS `ayudante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ayudante` (
  `dniAyudante` int(11) NOT NULL,
  `nomAyud` varchar(45) DEFAULT NULL,
  `apelAyud` varchar(45) DEFAULT NULL,
  `telfAyud` varchar(45) DEFAULT NULL,
  `coreAyud` varchar(45) DEFAULT NULL,
  `cuentaBancAyud` varchar(45) DEFAULT NULL,
  `Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`dniAyudante`),
  KEY `fk_Ayudante_Transporte1_idx` (`Transporte_idTran`),
  CONSTRAINT `fk_Ayudante_Transporte1` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ayudante`
--

LOCK TABLES `ayudante` WRITE;
/*!40000 ALTER TABLE `ayudante` DISABLE KEYS */;
INSERT INTO `ayudante` VALUES (72680376,'a','a','985','a','1',1),(72680386,'a','a','1','a','1',1);
/*!40000 ALTER TABLE `ayudante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `dniClie` int(11) NOT NULL,
  `nombClie` varchar(45) DEFAULT NULL,
  `apelClie` varchar(45) DEFAULT NULL,
  `celuClie` varchar(45) DEFAULT NULL,
  `coreClie` varchar(45) DEFAULT NULL,
  `cuenBancClie` varchar(45) DEFAULT NULL,
  `rucClie` varchar(45) DEFAULT NULL,
  `direClie` varchar(45) DEFAULT NULL,
  `Usuario_idUsua` int(11) NOT NULL,
  `Usuario_Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`dniClie`),
  KEY `fk_Cliente_Usuario1_idx` (`Usuario_idUsua`,`Usuario_Transporte_idTran`),
  KEY `fk_Cliente_Usuario1` (`Usuario_Transporte_idTran`),
  CONSTRAINT `fk_Cliente_Usuario1` FOREIGN KEY (`Usuario_Transporte_idTran`) REFERENCES `usuario` (`Transporte_idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (72680377,'Daniela','Carbja','876','dsa','NULL',NULL,'NULL',72680377,1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobante`
--

DROP TABLE IF EXISTS `comprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comprobante` (
  `idComp` int(11) NOT NULL,
  `NombComp` varchar(45) DEFAULT NULL,
  `tipoComp` varchar(45) DEFAULT NULL,
  `FechaComp` varchar(45) DEFAULT NULL,
  `Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`idComp`),
  KEY `fk_Comprobante_Transporte1_idx` (`Transporte_idTran`),
  CONSTRAINT `fk_Comprobante_Transporte1` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobante`
--

LOCK TABLES `comprobante` WRITE;
/*!40000 ALTER TABLE `comprobante` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conductor`
--

DROP TABLE IF EXISTS `conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `conductor` (
  `dniCond` int(11) NOT NULL,
  `nomCond` varchar(45) DEFAULT NULL,
  `apelCond` varchar(45) DEFAULT NULL,
  `telfCond` varchar(45) DEFAULT NULL,
  `coreCond` varchar(45) DEFAULT NULL,
  `cuenBancCond` varchar(45) DEFAULT NULL,
  `Transporte_idTran` int(11) NOT NULL,
  `numeLiceCond` varchar(45) DEFAULT NULL,
  `Vehiculo_placVehi` varchar(8) NOT NULL,
  `Ayudante_dniAyudante` int(11) NOT NULL,
  PRIMARY KEY (`dniCond`),
  KEY `fk_Conductor_Transporte1_idx` (`Transporte_idTran`),
  KEY `fk_Conductor_Vehiculo1_idx` (`Vehiculo_placVehi`),
  KEY `fk_Conductor_Ayudante1_idx` (`Ayudante_dniAyudante`),
  CONSTRAINT `fk_Conductor_Ayudante1` FOREIGN KEY (`Ayudante_dniAyudante`) REFERENCES `ayudante` (`dniAyudante`),
  CONSTRAINT `fk_Conductor_Transporte1` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`),
  CONSTRAINT `fk_Conductor_Vehiculo1` FOREIGN KEY (`Vehiculo_placVehi`) REFERENCES `vehiculo` (`placVehi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conductor`
--

LOCK TABLES `conductor` WRITE;
/*!40000 ALTER TABLE `conductor` DISABLE KEYS */;
INSERT INTO `conductor` VALUES (72680377,'a','a','1','a','1',1,'1','A-123',72680376),(72680387,'asa','sda','1','sd','1',1,'1','B-123',72680386);
/*!40000 ALTER TABLE `conductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL,
  `Cliente_dniClie` int(11) NOT NULL,
  `Cliente_Usuario_idUsua` int(11) NOT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `fk_Consulta_Cliente1_idx` (`Cliente_dniClie`,`Cliente_Usuario_idUsua`),
  CONSTRAINT `fk_Consulta_Cliente1` FOREIGN KEY (`Cliente_dniClie`) REFERENCES `cliente` (`dniClie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `control`
--

DROP TABLE IF EXISTS `control`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `control` (
  `idControl` int(11) NOT NULL AUTO_INCREMENT,
  `horaControl` varchar(45) DEFAULT NULL,
  `fechControl` varchar(45) DEFAULT NULL,
  `descpControl` varchar(45) DEFAULT NULL,
  `Empleado_dniEmpl` int(11) NOT NULL,
  `Vehiculo_placVehi` varchar(8) NOT NULL,
  `Paradero_idPara` int(11) NOT NULL,
  `Paradero_Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`idControl`),
  KEY `fk_Control_Empleado1_idx` (`Empleado_dniEmpl`),
  KEY `fk_Control_Vehiculo1_idx` (`Vehiculo_placVehi`),
  KEY `fk_Control_Paradero1_idx` (`Paradero_idPara`,`Paradero_Transporte_idTran`),
  CONSTRAINT `fk_Control_Empleado1` FOREIGN KEY (`Empleado_dniEmpl`) REFERENCES `empleado` (`dniEmpl`),
  CONSTRAINT `fk_Control_Paradero1` FOREIGN KEY (`Paradero_idPara`, `Paradero_Transporte_idTran`) REFERENCES `paradero` (`idPara`, `Transporte_idTran`),
  CONSTRAINT `fk_Control_Vehiculo1` FOREIGN KEY (`Vehiculo_placVehi`) REFERENCES `vehiculo` (`placVehi`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `control`
--

LOCK TABLES `control` WRITE;
/*!40000 ALTER TABLE `control` DISABLE KEYS */;
/*!40000 ALTER TABLE `control` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empleado` (
  `dniEmpl` int(11) NOT NULL,
  `nombEmpl` varchar(45) DEFAULT NULL,
  `apelEmpl` varchar(45) DEFAULT NULL,
  `celuEmpl` varchar(45) DEFAULT NULL,
  `coreEmpl` varchar(45) DEFAULT NULL,
  `cuenBancEmpl` varchar(45) DEFAULT NULL,
  `direEmpl` varchar(45) DEFAULT NULL,
  `Usuario_idUsua` int(11) NOT NULL,
  `Usuario_Transporte_idTran` int(11) NOT NULL,
  PRIMARY KEY (`dniEmpl`),
  KEY `fk_Empleado_Usuario1_idx` (`Usuario_idUsua`,`Usuario_Transporte_idTran`),
  KEY `fk_Empleado_Usuario1` (`Usuario_Transporte_idTran`),
  CONSTRAINT `fk_Empleado_Usuario1` FOREIGN KEY (`Usuario_Transporte_idTran`) REFERENCES `usuario` (`Transporte_idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (72680376,'AA','asd','955','sd','NULL','NULL',72680376,1),(72680378,'Aurelio','as','985','asd','NULL','NULL',72680378,1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informe`
--

DROP TABLE IF EXISTS `informe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `informe` (
  `idInfo` int(11) NOT NULL AUTO_INCREMENT,
  `nombInfo` varchar(45) DEFAULT NULL,
  `tipoInfo` varchar(45) DEFAULT NULL,
  `areaInfo` varchar(45) DEFAULT NULL,
  `fechaInfo` varchar(45) DEFAULT NULL,
  `descpInfo` varchar(45) DEFAULT NULL,
  `Administrador_dniAdmi` int(11) NOT NULL,
  PRIMARY KEY (`idInfo`),
  KEY `fk_Informe_Administrador1_idx` (`Administrador_dniAdmi`),
  CONSTRAINT `fk_Informe_Administrador1` FOREIGN KEY (`Administrador_dniAdmi`) REFERENCES `administrador` (`dniAdmi`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informe`
--

LOCK TABLES `informe` WRITE;
/*!40000 ALTER TABLE `informe` DISABLE KEYS */;
INSERT INTO `informe` VALUES (1,'MI PRIMER REPORTE','Pago total','Empleado','Sun Aug 30 20:41:12 COT 2020','Mi primer report :3',72680375),(2,'PAGO TOTAL','Pago total','Empleado','Sun Aug 30 20:44:30 COT 2020','Pago total',72680374),(3,'ASD','Ingreso total','Empleado','Sun Aug 30 21:04:55 COT 2020','das',72680375),(4,'SDSA','Ingreso total','Empleado','Sun Aug 30 21:04:55 COT 2020','da',72680375),(5,'das','Pago total','Empleado','Sun Aug 30 21:46:48 COT 2020','sda',72680375),(6,'wqe','Ingreso total','Empleado','Sun Aug 30 21:46:48 COT 2020','',72680375),(7,'sad','Ingreso total','Empleado','Sun Aug 30 21:46:48 COT 2020','',72680375),(8,'72680375','Pago total','Empleado','null','',72680375),(9,'sad','Ganancia total','Empleado','null','',72680375),(10,'sad','Pago total','Empleado','null','',72680375),(11,'sad','Ganancia total','Empleado','Sat Aug 08 22:12:21 COT 2020','asd',72680375),(12,'dsa','Ingreso total','Empleado','Sat Aug 08 22:12:21 COT 2020','ad',72680375),(13,'Resporte','Pago total','Empleado','Sun Aug 30 22:29:54 COT 2020','das',72680375),(14,'REPORTE','Pago total','Empleado','Mon Aug 31 05:09:22 COT 2020','',72680375),(15,'Reporte','Pago total','Empleado','Mon Aug 31 08:27:39 COT 2020','',72680375),(16,'Reporte','Ingreso total','Empleado','Mon Aug 31 08:27:39 COT 2020','',72680375),(17,'a','Ganancia total','Empleado','Mon Aug 31 08:27:39 COT 2020','',72680375),(18,'Report','Pago total','Empleado','Mon Aug 31 08:40:00 COT 2020','',72680375),(19,'Reporte','Ingreso total','Empleado','Mon Aug 31 08:40:00 COT 2020','',72680375),(20,'sfa','Ingreso total','Empleado','Mon Aug 31 08:40:00 COT 2020','',72680375),(21,'Reporte','Pago total','Empleado','Mon Aug 31 00:00:00 COT 2020','',72680375),(22,'Report','Pago total','Empleado','Mon Aug 31 08:46:32 COT 2020','',72680375),(23,'Report','Ingreso total','Empleado','Mon Aug 31 08:46:32 COT 2020','',72680375),(24,'Reporte','Pago total','Empleado','Mon Aug 31 08:56:16 COT 2020','',72680375),(25,'Ingreso','Ingreso total','Empleado','Mon Aug 31 08:56:16 COT 2020','',72680375),(26,'Reporte','Pago total','Empleado','Mon Aug 31 09:36:55 COT 2020','',72680375),(27,'Ingreso','Ingreso total','Empleado','Mon Aug 31 09:36:55 COT 2020','',72680375),(28,'Report','Ingreso total','Empleado','Sat Aug 01 09:40:41 COT 2020','',72680375),(29,'Resumen','Ingreso total','Empleado','Mon Aug 31 09:53:57 COT 2020','',72680375),(30,'Ingreso','Ingreso total','Empleado','Mon Aug 31 10:06:02 COT 2020','',72680375),(31,'informe','Ingreso total','Empleado','Mon Aug 31 10:12:13 COT 2020','sda',72680375),(32,'Asad','Ganancia total','Empleado','Mon Aug 31 10:12:13 COT 2020','',72680375),(33,'Ingreso','Ingreso total','Empleado','Mon Aug 31 10:15:26 COT 2020','das',72680375),(34,'Ingresos','Ingreso total','Empleado','Mon Aug 31 10:17:45 COT 2020','aasd',72680375),(35,'Ingresos','Ingreso total','Empleado','Mon Aug 31 11:04:55 COT 2020','das',72680375),(36,'Ganancia total','Ganancia total','Empleado','Mon Aug 31 13:01:06 COT 2020','',72680375),(37,'Ganancia','Ganancia total','Empleado','Mon Aug 31 13:06:43 COT 2020','dasd',72680375),(38,'Ingresos','Ingreso total','Empleado','Mon Aug 31 14:32:08 COT 2020','Ingresos',72680375),(39,'Pagos','Pago total','Empleado','Mon Aug 31 14:32:08 COT 2020','Ingresos',72680375),(40,'Ganancia','Ganancia total','Empleado','Mon Aug 31 14:32:08 COT 2020','Ingresos',72680375),(41,'REPORTE DE FIN DE MES','Pago total','Empleado','Mon Aug 31 20:56:32 COT 2020','',72680375),(42,'REPORTE QUINCENAL','Ingreso total','Empleado','Mon Aug 31 20:59:44 COT 2020','',72680375),(43,'GANANCIAS','Ganancia total','Empleado','Mon Aug 31 20:59:44 COT 2020','',72680375);
/*!40000 ALTER TABLE `informe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operacionayudante`
--

DROP TABLE IF EXISTS `operacionayudante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `operacionayudante` (
  `idOper` int(11) NOT NULL AUTO_INCREMENT,
  `nombOper` varchar(45) DEFAULT NULL,
  `IngresoOper` varchar(45) DEFAULT NULL,
  `pagoOper` varchar(45) DEFAULT NULL,
  `horaOper` varchar(45) DEFAULT NULL,
  `fechOper` varchar(45) DEFAULT NULL,
  `descpOper` varchar(45) DEFAULT NULL,
  `Empleado_dniEmpl` int(11) NOT NULL,
  `Ayudante_dniAyudante` int(11) NOT NULL,
  PRIMARY KEY (`idOper`),
  KEY `fk_Operación_Empleado1_idx` (`Empleado_dniEmpl`),
  KEY `fk_Operacion_Ayudante_Ayudante1_idx` (`Ayudante_dniAyudante`),
  CONSTRAINT `fk_Operacion_Ayudante_Ayudante1` FOREIGN KEY (`Ayudante_dniAyudante`) REFERENCES `ayudante` (`dniAyudante`),
  CONSTRAINT `fk_Operación_Empleado1` FOREIGN KEY (`Empleado_dniEmpl`) REFERENCES `empleado` (`dniEmpl`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operacionayudante`
--

LOCK TABLES `operacionayudante` WRITE;
/*!40000 ALTER TABLE `operacionayudante` DISABLE KEYS */;
INSERT INTO `operacionayudante` VALUES (1,'Pago ayudante',NULL,'20','8','30/08/2020','sda',72680376,72680376);
/*!40000 ALTER TABLE `operacionayudante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operacionconductor`
--

DROP TABLE IF EXISTS `operacionconductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `operacionconductor` (
  `idOper` int(11) NOT NULL AUTO_INCREMENT,
  `nombOper` varchar(45) DEFAULT NULL,
  `IngresoOper` varchar(45) DEFAULT NULL,
  `pagoOper` varchar(45) DEFAULT NULL,
  `horaOper` varchar(45) DEFAULT NULL,
  `fechOper` varchar(45) DEFAULT NULL,
  `descpOper` varchar(45) DEFAULT NULL,
  `Empleado_dniEmpl` int(11) NOT NULL,
  `Conductor_dniCond` int(11) NOT NULL,
  PRIMARY KEY (`idOper`),
  KEY `fk_Operación_Empleado1_idx` (`Empleado_dniEmpl`),
  KEY `fk_OperacionConductor_Conductor1_idx` (`Conductor_dniCond`),
  CONSTRAINT `fk_OperacionConductor_Conductor1` FOREIGN KEY (`Conductor_dniCond`) REFERENCES `conductor` (`dniCond`),
  CONSTRAINT `fk_Operación_Empleado10` FOREIGN KEY (`Empleado_dniEmpl`) REFERENCES `empleado` (`dniEmpl`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operacionconductor`
--

LOCK TABLES `operacionconductor` WRITE;
/*!40000 ALTER TABLE `operacionconductor` DISABLE KEYS */;
INSERT INTO `operacionconductor` VALUES (3,'Ingreso','50',NULL,'1','dd/MM/yyyy','as',72680376,72680387),(4,'Ingreso','50',NULL,'4','dd/MM/yyyy','asd',72680376,72680377),(5,'Ingreso','30',NULL,'6','dd/MM/yyyy','monto total',72680376,72680377),(6,'Pago conductor',NULL,'50','1','dd/MM/yyyy','Pago total',72680376,72680377),(7,'Pago conductor',NULL,'30','8','','',72680376,72680377),(8,'Pago conductor',NULL,'80','7','','Pago',72680376,72680387),(9,'Pago conductor',NULL,'50','8','','',72680376,72680377),(10,'Ingreso','50',NULL,'1','Fri Aug 14 00:00:00 COT 2020','asd',72680376,72680377),(11,'Ingreso','200',NULL,'8:00','dd/MM/yyyy','Excelente ingreso',72680376,72680377),(12,'Ingreso','10',NULL,'1','Sun Aug 09 00:00:00 COT 2020','das',72680376,72680387),(13,'Ingreso','20',NULL,'8','30/08/2020','sda',72680376,72680377),(14,'Ingreso','80',NULL,'8','29/08/2020','sad',72680376,72680377),(15,'Ingreso','30',NULL,'10:00','19/08/2020','sdas',72680376,72680377),(16,'Pago conductor',NULL,'50','8','30/08/2020','ads',72680376,72680377),(17,'Pago conductor',NULL,'30','8','10/08/2020','sdada',72680376,72680377);
/*!40000 ALTER TABLE `operacionconductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operacionpropietario`
--

DROP TABLE IF EXISTS `operacionpropietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `operacionpropietario` (
  `idOper` int(11) NOT NULL AUTO_INCREMENT,
  `nombOper` varchar(45) DEFAULT NULL,
  `pagoOper` varchar(45) DEFAULT NULL,
  `horaOper` varchar(45) DEFAULT NULL,
  `fechOper` varchar(45) DEFAULT NULL,
  `descpOper` varchar(45) DEFAULT NULL,
  `Empleado_dniEmpl` int(11) NOT NULL,
  `Propietario_dniProp` int(11) NOT NULL,
  PRIMARY KEY (`idOper`),
  KEY `fk_Operación_Empleado1_idx` (`Empleado_dniEmpl`),
  KEY `fk_OperacionPropietario_Propietario1_idx` (`Propietario_dniProp`),
  CONSTRAINT `fk_OperacionPropietario_Propietario1` FOREIGN KEY (`Propietario_dniProp`) REFERENCES `propietario` (`dniProp`),
  CONSTRAINT `fk_Operación_Empleado100` FOREIGN KEY (`Empleado_dniEmpl`) REFERENCES `empleado` (`dniEmpl`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operacionpropietario`
--

LOCK TABLES `operacionpropietario` WRITE;
/*!40000 ALTER TABLE `operacionpropietario` DISABLE KEYS */;
/*!40000 ALTER TABLE `operacionpropietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paradero`
--

DROP TABLE IF EXISTS `paradero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `paradero` (
  `idPara` int(11) NOT NULL AUTO_INCREMENT,
  `Transporte_idTran` int(11) NOT NULL,
  `nombPara` varchar(45) DEFAULT NULL,
  `direPara` varchar(45) DEFAULT NULL,
  `estaPara` varchar(45) DEFAULT NULL,
  `cordPara` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPara`,`Transporte_idTran`),
  KEY `fk_Paradero_Transporte1_idx` (`Transporte_idTran`),
  CONSTRAINT `fk_Paradero_Transporte1` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paradero`
--

LOCK TABLES `paradero` WRITE;
/*!40000 ALTER TABLE `paradero` DISABLE KEYS */;
/*!40000 ALTER TABLE `paradero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietario`
--

DROP TABLE IF EXISTS `propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `propietario` (
  `dniProp` int(11) NOT NULL,
  `nombProp` varchar(45) DEFAULT NULL,
  `apelProp` varchar(45) DEFAULT NULL,
  `telfProp` varchar(45) DEFAULT NULL,
  `direProp` varchar(45) DEFAULT NULL,
  `cuenBancProp` varchar(45) DEFAULT NULL,
  `rucProp` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dniProp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietario`
--

LOCK TABLES `propietario` WRITE;
/*!40000 ALTER TABLE `propietario` DISABLE KEYS */;
INSERT INTO `propietario` VALUES (72680375,'a','a','1','a','1','1'),(72680385,'DAS','DAD','1','DSA','1','1');
/*!40000 ALTER TABLE `propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL AUTO_INCREMENT,
  `tipoReserva` varchar(45) DEFAULT NULL,
  `horaReserva` varchar(45) DEFAULT NULL,
  `direRese` varchar(45) DEFAULT NULL,
  `origReserv` varchar(45) DEFAULT NULL,
  `destReserva` varchar(45) DEFAULT NULL,
  `costoReserva` varchar(45) DEFAULT NULL,
  `Cliente_dniClie` int(11) NOT NULL,
  `Vehiculo_placVehi` varchar(8) NOT NULL,
  PRIMARY KEY (`idReserva`),
  KEY `fk_Reserva_Cliente1_idx` (`Cliente_dniClie`),
  KEY `fk_Reserva_Vehiculo1_idx` (`Vehiculo_placVehi`),
  CONSTRAINT `fk_Reserva_Cliente1` FOREIGN KEY (`Cliente_dniClie`) REFERENCES `cliente` (`dniClie`),
  CONSTRAINT `fk_Reserva_Vehiculo1` FOREIGN KEY (`Vehiculo_placVehi`) REFERENCES `vehiculo` (`placVehi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (3,'Moto','8:52','a','a','a','20',72680377,'A-123');
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ticket` (
  `idTicket` int(11) NOT NULL,
  `fechaTicket` varchar(45) NOT NULL,
  `Conductor_dniCond` int(11) NOT NULL,
  `Ayudante_dniAyudante` int(11) NOT NULL,
  `tipoTicket` varchar(45) DEFAULT NULL,
  `tarifaTicket` varchar(45) DEFAULT NULL,
  `TicketAcumuladoDia_idTia` int(11) NOT NULL,
  PRIMARY KEY (`idTicket`,`fechaTicket`,`Conductor_dniCond`,`Ayudante_dniAyudante`),
  KEY `fk_Ticket_Conductor1_idx` (`Conductor_dniCond`),
  KEY `fk_Ticket_Ayudante1_idx` (`Ayudante_dniAyudante`),
  KEY `fk_Ticket_TicketAcumuladoDia1_idx` (`TicketAcumuladoDia_idTia`),
  CONSTRAINT `fk_Ticket_Ayudante1` FOREIGN KEY (`Ayudante_dniAyudante`) REFERENCES `ayudante` (`dniAyudante`),
  CONSTRAINT `fk_Ticket_Conductor1` FOREIGN KEY (`Conductor_dniCond`) REFERENCES `conductor` (`dniCond`),
  CONSTRAINT `fk_Ticket_TicketAcumuladoDia1` FOREIGN KEY (`TicketAcumuladoDia_idTia`) REFERENCES `ticketacumuladodia` (`idTia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketacumuladodia`
--

DROP TABLE IF EXISTS `ticketacumuladodia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ticketacumuladodia` (
  `idTia` int(11) NOT NULL AUTO_INCREMENT,
  `acumulaTia` varchar(45) DEFAULT NULL,
  `fechaTia` varchar(45) DEFAULT NULL,
  `OperacionConductor_idOper` int(11) NOT NULL,
  `OperacionAyudante_idOper` int(11) NOT NULL,
  PRIMARY KEY (`idTia`),
  KEY `fk_TicketAcumuladoDia_OperacionConductor1_idx` (`OperacionConductor_idOper`),
  KEY `fk_TicketAcumuladoDia_OperacionAyudante1_idx` (`OperacionAyudante_idOper`),
  CONSTRAINT `fk_TicketAcumuladoDia_OperacionAyudante1` FOREIGN KEY (`OperacionAyudante_idOper`) REFERENCES `operacionayudante` (`idOper`),
  CONSTRAINT `fk_TicketAcumuladoDia_OperacionConductor1` FOREIGN KEY (`OperacionConductor_idOper`) REFERENCES `operacionconductor` (`idOper`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketacumuladodia`
--

LOCK TABLES `ticketacumuladodia` WRITE;
/*!40000 ALTER TABLE `ticketacumuladodia` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticketacumuladodia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaccion`
--

DROP TABLE IF EXISTS `transaccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transaccion` (
  `idTransac` int(11) NOT NULL,
  `nombTransac` varchar(45) DEFAULT NULL,
  `tipoTransac` varchar(45) DEFAULT NULL,
  `montoTransac` varchar(45) DEFAULT NULL,
  `igvTransac` varchar(45) DEFAULT NULL,
  `fechaTransac` varchar(45) DEFAULT NULL,
  `Comprobante_idComp` int(11) NOT NULL,
  `OperacionAyudante_idOper` int(11) NOT NULL,
  `OperacionConductor_idOper` int(11) NOT NULL,
  `OperacionPropietario_idOper` int(11) NOT NULL,
  `Reserva_idReserva` int(11) NOT NULL,
  PRIMARY KEY (`idTransac`),
  KEY `fk_Transaccion_Comprobante1_idx` (`Comprobante_idComp`),
  KEY `fk_Transaccion_OperacionAyudante1_idx` (`OperacionAyudante_idOper`),
  KEY `fk_Transaccion_OperacionConductor1_idx` (`OperacionConductor_idOper`),
  KEY `fk_Transaccion_OperacionPropietario1_idx` (`OperacionPropietario_idOper`),
  KEY `fk_Transaccion_Reserva1_idx` (`Reserva_idReserva`),
  CONSTRAINT `fk_Transaccion_Comprobante1` FOREIGN KEY (`Comprobante_idComp`) REFERENCES `comprobante` (`idComp`),
  CONSTRAINT `fk_Transaccion_OperacionAyudante1` FOREIGN KEY (`OperacionAyudante_idOper`) REFERENCES `operacionayudante` (`idOper`),
  CONSTRAINT `fk_Transaccion_OperacionConductor1` FOREIGN KEY (`OperacionConductor_idOper`) REFERENCES `operacionconductor` (`idOper`),
  CONSTRAINT `fk_Transaccion_OperacionPropietario1` FOREIGN KEY (`OperacionPropietario_idOper`) REFERENCES `operacionpropietario` (`idOper`),
  CONSTRAINT `fk_Transaccion_Reserva1` FOREIGN KEY (`Reserva_idReserva`) REFERENCES `reserva` (`idReserva`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaccion`
--

LOCK TABLES `transaccion` WRITE;
/*!40000 ALTER TABLE `transaccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transporte`
--

DROP TABLE IF EXISTS `transporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transporte` (
  `idTran` int(11) NOT NULL AUTO_INCREMENT,
  `NombTran` varchar(45) DEFAULT NULL,
  `tipoTran` varchar(45) DEFAULT NULL,
  `paisTran` varchar(45) DEFAULT NULL,
  `regiTran` varchar(45) DEFAULT NULL,
  `ciudTran` varchar(45) DEFAULT NULL,
  `distTran` varchar(45) DEFAULT NULL,
  `rutaTran` varchar(45) DEFAULT NULL,
  `cantParaTran` varchar(45) DEFAULT NULL,
  `direParaPrinTran` varchar(45) DEFAULT NULL,
  `horaInicTran` varchar(45) DEFAULT NULL,
  `horaFinaTran` varchar(45) DEFAULT NULL,
  `rucTran` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTran`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transporte`
--

LOCK TABLES `transporte` WRITE;
/*!40000 ALTER TABLE `transporte` DISABLE KEYS */;
INSERT INTO `transporte` VALUES (1,'Arguedas','Combi','Perú','Apurimac','Andahuylas','Andahuaylas','Chumbao','3','Av.Arguedas','8:00','21:00','1255');
/*!40000 ALTER TABLE `transporte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `usuaUsua` varchar(45) NOT NULL,
  `Transporte_idTran` int(11) NOT NULL,
  `paswUsua` varchar(45) DEFAULT NULL,
  `tipoUsua` varchar(45) DEFAULT NULL,
  `EstaUsua` varchar(45) DEFAULT NULL,
  `FotoUsua` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`usuaUsua`,`Transporte_idTran`),
  KEY `fk_Usuario_Transporte1_idx` (`Transporte_idTran`),
  CONSTRAINT `fk_Usuario_Transporte1` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('72680374',1,'123456','Administrador','Habilitado',NULL),('72680375',1,'123456','Administrador','Habilitado',NULL),('72680376',1,'123456','Empleado','Habilitado',NULL),('72680377',1,'123456','Cliente','Habilitado',NULL),('72680378',1,'123456','Empleado','Habilitado',NULL),('72680394',1,'123456','Administrador','Habilitado',NULL),('78657',1,'','Cliente','En papelera',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehiculo` (
  `placVehi` varchar(8) NOT NULL,
  `tipoVehi` varchar(45) DEFAULT NULL,
  `soatVehi` varchar(45) DEFAULT NULL,
  `serieVehi` varchar(45) DEFAULT NULL,
  `añofabricVehi` varchar(45) DEFAULT NULL,
  `Transporte_idTran` int(11) NOT NULL,
  `Propietario_dniProp` int(11) NOT NULL,
  PRIMARY KEY (`placVehi`),
  KEY `fk_Vehiculo_Transporte_idx` (`Transporte_idTran`),
  KEY `fk_Vehiculo_Propietario1_idx` (`Propietario_dniProp`),
  CONSTRAINT `fk_Vehiculo_Propietario1` FOREIGN KEY (`Propietario_dniProp`) REFERENCES `propietario` (`dniProp`),
  CONSTRAINT `fk_Vehiculo_Transporte` FOREIGN KEY (`Transporte_idTran`) REFERENCES `transporte` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES ('A-123','a','1','1','2010',1,72680375),('B-123','a','45','155','1998',1,72680385);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sistranspublic'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-01 16:52:45
