-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: muldshop
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `san_pham`
--

DROP TABLE IF EXISTS `san_pham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `san_pham` (
  `ma_san_pham` int NOT NULL,
  `ma_danh_muc` int NOT NULL,
  `ten_san_pham` varchar(255) NOT NULL,
  `hinh_anh` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `so_luong` int NOT NULL,
  `mo_ta` varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `don_gia` int NOT NULL,
  `giam_gia` int DEFAULT NULL,
  PRIMARY KEY (`ma_san_pham`,`ma_danh_muc`),
  KEY `ma_danh_muc_idx` (`ma_danh_muc`),
  CONSTRAINT `ma_danh_muc` FOREIGN KEY (`ma_danh_muc`) REFERENCES `danh_muc` (`ma_danh_muc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `san_pham`
--

LOCK TABLES `san_pham` WRITE;
/*!40000 ALTER TABLE `san_pham` DISABLE KEYS */;
INSERT INTO `san_pham` VALUES (1,2,'Dell G3 3500 i7','images\\shoptech\\dell-g3.jpg',10,'Kiểu dáng độc đáo, độ bền đáng tin cậy \r\nDell G3 15 có thiết kế đầy phong cách, thể hiện chất riêng của game thủ nhưng vẫn mang hơi hướng hiện đại, bền bỉ của thương hiệu Dell. Những đường cắt táo bạo, phiên bản đen tuyền cá tính cùng những dải màu xanh tạo điểm nhấn, Dell G3 15 cho bạn thêm niềm cảm hứng trong mỗi trận chiến game. Hơn nữa với thiết kế gọn gàng và trọng lượng chỉ 2.34 kg, bạn có thể dễ dàng mang laptop đi khắp mọi nơi để tận hưởng đam mê.',1900,10),(2,5,'Realme 3 pro','images\\shoptech\\realme-3.jpg',99,'Realme APK',400,20),(3,2,'Dell 30','images\\shoptech\\Laptop-Dell-30.jpg',10,'Laptop vip',1500,15),(4,5,'Realme 5','images\\shoptech\\realme-5.jpg',10,'Realme 5',500,20),(5,5,'Realme 5 pro','images\\shoptech\\realme-q5-pro.jpg',20,'Realme 5 pro bản vip',1000,13);
/*!40000 ALTER TABLE `san_pham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-27 18:26:05
