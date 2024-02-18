-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gestion_recetas
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `auditoria`
--

DROP TABLE IF EXISTS `auditoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auditoria` (
  `aud_id` int NOT NULL AUTO_INCREMENT,
  `aud_receta` varchar(5000) DEFAULT NULL,
  `aud_detalle` varchar(5000) DEFAULT NULL,
  `aud_fecha` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`aud_id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditoria`
--

LOCK TABLES `auditoria` WRITE;
/*!40000 ALTER TABLE `auditoria` DISABLE KEYS */;
INSERT INTO `auditoria` VALUES (1,'BOLONES DE VERDE','se inserto una receta',NULL),(2,'Arroz con pollo','se inserto una receta',NULL),(3,'ABORRAJADOS ','se actualizo la receta','2024-02-11 22:08:18'),(4,'Arroz con pollo','se elimino la receta','2024-02-11 22:10:33'),(5,'','se inserto una receta','2024-02-13 12:18:04'),(6,'','se actualizo la receta','2024-02-13 12:19:22'),(7,'BOLONES ','se elimino la receta','2024-02-13 12:20:58'),(8,'CEVICEH DE CAMARON','se inserto una receta','2024-02-13 12:22:31'),(9,'GUATITA','se inserto una receta','2024-02-13 12:24:36'),(10,'EMPANADAS DE VERDE CON QUESO  ','se inserto una receta','2024-02-13 12:29:46'),(11,'JUGO DE MANDARINA','se inserto una receta','2024-02-13 17:08:13'),(12,'JUGO DE MANDARINA','se actualizo la receta','2024-02-13 17:08:49'),(13,'JUGO DE SANDÍA CON FRESA','se inserto una receta','2024-02-13 17:10:18'),(14,'JUGO DE AVENA','se inserto una receta','2024-02-13 17:11:07'),(15,'MAQUEÑO MANABA','se inserto una receta','2024-02-13 17:18:50'),(16,'TROLICHES CASEROS ','se inserto una receta','2024-02-13 17:21:47'),(17,'RECETA ARROZ CON MENESTRA','se inserto una receta','2024-02-16 10:58:55'),(18,'CARNE ASADA CON MENESTRA','se inserto una receta','2024-02-16 11:13:11'),(19,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 12:25:21'),(20,'RECETA ARROZ CON MENESTRA','se actualizo la receta','2024-02-16 12:30:53'),(21,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 12:31:09'),(22,'CALDO DE BAGRE','se inserto una receta','2024-02-16 12:33:39'),(23,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 13:41:51'),(24,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 21:03:28'),(25,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 21:04:50'),(26,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 21:10:49'),(27,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 21:27:58'),(28,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 21:30:21'),(29,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 21:34:06'),(30,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 21:38:46'),(31,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 21:39:47'),(32,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:22:00'),(33,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:25:38'),(34,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 22:25:46'),(35,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 22:25:57'),(36,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:32:25'),(37,'RECETA ARROZ CON MENESTRA','se actualizo la receta','2024-02-16 22:32:55'),(38,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 22:33:00'),(39,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 22:33:07'),(40,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:36:56'),(41,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:41:56'),(42,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:42:43'),(43,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:47:36'),(44,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:49:18'),(45,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 22:50:43'),(46,'MAQUEÑO MANABA','se inserto una receta','2024-02-16 23:08:58'),(47,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:18:34'),(48,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:18:34'),(49,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:19:15'),(50,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:19:15'),(51,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:25:03'),(52,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:25:03'),(53,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:36:09'),(54,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:36:09'),(55,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:37:35'),(56,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:37:35'),(57,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:53:05'),(58,'MAQUEÑO MANABA','se actualizo la receta','2024-02-16 23:53:05'),(59,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 23:58:38'),(60,'TROLICHES CASEROS ','se actualizo la receta','2024-02-16 23:58:44'),(61,'RECETA ARROZ CON MENESTRA','se actualizo la receta','2024-02-16 23:58:53'),(62,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-16 23:59:07'),(63,'CALDO DE BAGRE','se actualizo la receta','2024-02-16 23:59:15'),(64,'MAQUEÑO MANABA','se elimino la receta','2024-02-17 00:02:56'),(65,'MAQUEÑO MANABA','se elimino la receta','2024-02-17 00:02:56'),(66,'CALDO DE BAGRE','se elimino la receta','2024-02-17 00:05:43'),(67,'GUATITA','se actualizo la receta','2024-02-17 16:41:17'),(68,'GUATITA','se actualizo la receta','2024-02-17 16:50:27'),(69,'CEVICEH DE CAMARON','se actualizo la receta','2024-02-17 16:59:31'),(70,'CEVICHE DE CAMARON','se actualizo la receta','2024-02-17 17:08:51'),(71,'CEVICHE DE CAMARON','se actualizo la receta','2024-02-17 17:10:01'),(72,'BOLONES DE VERDE','se actualizo la receta','2024-02-17 17:13:17'),(73,'ENCEBOLLADO','se actualizo la receta','2024-02-17 17:15:53'),(74,'CEVICHE DE CAMARON','se actualizo la receta','2024-02-17 17:16:53'),(75,'GUATITA','se actualizo la receta','2024-02-17 17:17:37'),(76,'EMPANADAS DE VERDE CON QUESO  ','se actualizo la receta','2024-02-17 17:20:08'),(77,'JUGO DE MANDARINA','se actualizo la receta','2024-02-17 17:21:23'),(78,'JUGO DE SANDÍA CON FRESA','se actualizo la receta','2024-02-17 17:21:37'),(79,'JUGO DE AVENA','se actualizo la receta','2024-02-17 17:21:49'),(80,'TROLICHES CASEROS ','se actualizo la receta','2024-02-17 17:30:16'),(81,'RECETA ARROZ CON MENESTRA','se actualizo la receta','2024-02-17 17:33:39'),(82,'RECETA ARROZ CON MENESTRA','se actualizo la receta','2024-02-17 17:34:16'),(83,'CARNE ASADA CON MENESTRA','se actualizo la receta','2024-02-17 17:35:19'),(84,' ARROZ CON MENESTRA','se actualizo la receta','2024-02-17 17:35:37');
/*!40000 ALTER TABLE `auditoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `cat_id` int NOT NULL AUTO_INCREMENT,
  `cat_nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Postre'),(2,'Jugos '),(3,'Desayuno'),(4,'Platos fuertes'),(7,'almuerzos');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recetas`
--

DROP TABLE IF EXISTS `recetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recetas` (
  `re_id` int NOT NULL AUTO_INCREMENT,
  `re_titulo` text NOT NULL,
  `re_ingredientes` text,
  `re_preparacion` text,
  `cat_id` int DEFAULT NULL,
  `usu_id` int DEFAULT NULL,
  PRIMARY KEY (`re_id`),
  KEY `cat_id` (`cat_id`),
  KEY `usu_id` (`usu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recetas`
--

LOCK TABLES `recetas` WRITE;
/*!40000 ALTER TABLE `recetas` DISABLE KEYS */;
INSERT INTO `recetas` VALUES (6,'BOLONES DE VERDE','4 plátanos verdes pelados y cortados en trozos medianos\n\n4-5 cucharadas de mantequilla o manteca de chancho\n\n2 cucharadas de aceite de canola o de girasol\n\n1 cucharada de ají picante o chile molido\n\n1 cucharada de comino molido\n\n1 taza de queso desmenuzado o rallado o 1 taza de chorizo cocido o chicharrones y/o maní o cacahuates molidos\nSal al gusto','\n1. Agregue los trozos de plátano y cocine a temperatura media baja durante unos 30-40 minutos o hasta que\n    estén muy suaves, volteándolos cada 10 minutos. Deben quedar ligeramente dorados, pero no crujientes.\n\n2. Espolvoree los trozos de plátanos cocidos con aji en polvo o chile molido, el comino, y sal al gusto.\n\n3. Ponga los pedazos de plátanos calientes en un tazón grande.\n\n4. Machaque los plátanos hasta obtener una masa gruesa.\n\n5. Forma bolas pequeñas con la masa, el tamaño debe ser un poco más pequeño que una pelota de tenis.\n\n6. Haga un agujero en el centro de cada bola y rellénelo con el queso (o chorizo o chicharrones). \n    Presione con suavidad el relleno, cúbralo y fórmelo nuevamente en forma de bola.\n\n7. El bolon de verde se puede servir de esta manera directamente. Si lo prefiere con un exterior un poco \n    crujiente y bien caliente, puede seguir los pasos restantes.\n\n8. Caliente el aceite a fuego alto, agregue las bolas de plátano rellenas y fríalas hasta que estén doradas \n    y crujientes por ambos lados.\n\n9. Ponga los bolones fritos en un plato cubierto con papel absorbente para escurrir la grasa y sirva \n     inmediatamente acompañado de café y huevo frito.',3,8),(8,'ENCEBOLLADO','1 Cucharada Aceite Vegetal\n\n1 1/2 Taza Cebolla Morada picada en tiras finas\n\n3 Tomates riñón maduros y picados en cuartos\n\n1/2 Cucharada Comino Molido\n\n2 Cucharaditas Ají para seco\n\n1 1/2 Litro Agua\n\n4 Cucharadas Cilantro fresco picado finamente\n\n1 libra de albacora fresca, en lomos\n\n2 Tazas Yuca cortada en cubos\n\n2/3 Taza Pimiento Rojo picado en pedazos grandes\n\n2/3 Taza Pimiento Verde Picado en pedazos grandes\n\n1/2 Taza Apio picado en pedazos grandes\n\n2 Cubos Caldo De Verduras Maggi®\n\n2 Dientes de ajo\n\n4 Unidades Limón cortado en cuartos','1.  Coloca en una olla a hervir el agua, añade 2 tomates y media cebolla paiteña picados,\n      añade el apio los trozos de pimiento, 2 cucharadas de cilantro, ajos, comino, sal, pimienta y aji para seco.\n\n2.  En otra olla aparte cocina la yuca picada previamente con bastante agua hasta que este suave.\n\n3.  Por aparte realiza el encurtido de cebolla con el resto de cebolla paiteña picada finamente, lavada, \n     escurrida y sazonada con sal, limon y cilantro restante picado. Deja reposar hasta que se curta.\n\n4.  Añade en el caldo del paso 1 los lomos de albacora, cocinala completamente y retira de la olla.\n\n5.  Luego de reservada la albacora cocida, retira los vegetales del caldo y colócalos en una licuadora,\n     añade un poco de yuca cocida y un poco de líquido de cocción de la yuca. Cierne el líquido procesado \n     sobre el caldo y añade el agua de cocción de las yucas. Disuelve los cubos de Caldo de Verduras MAGGI®. \n     Llevamos a ebullición durante 5 minutos a fuego medio. Regresamos la albacora a la preparación.',4,1),(9,'CEVICHE DE CAMARON','2 Unidades Cebolla Morada Picadas en tiras finas\n\n1 Taza Jugo De Limón\n\n4 Cucharadas Salsa De Tomate Maggi®\n\n1/4 Taza Néctar De Naranja Natura®\n\n1 Unidad Tomate Cherry\n\n2 Unidades Tomate sin pepas y picado\n\n1 Cucharada Mostaza Maggi®\n\n3 Tazas Camarones Pelados y cocidos\n\n1 Pizca Sal Al gusto\n\n1 Pizca Pimienta Negra Al gusto\n\n1 Cucharadita Cilantro Al gusto','    Curtir la cebolla\n\n1.  Lava la cebolla y cúrtela con un poco de sal. Reserva.\n    \n Para el líquido del ceviche\n\n2.  En una tazón mezcla jugo de limón, Salsa de Tomate MAGGI®, tomate licuado, tomate picado, \n     cebollas, NATURA® Néctar Naranja y Mostaza MAGGI®.\n     \n   Usa los camarones\n\n3.  Añade los camarones y cilantro. Para terminar sazona con sal y pimienta negra al gusto.\n  \nSUGERENCIA: Acompañe con plátano verde en forma de chifles o patacones y limón.',4,1),(10,'GUATITA','3 Tazas Mondongo\n\n2 Ramas Cebolla Larga\n\n2 Ramas Apio Picado\n\n2 Cucharadas Aceite Con Achiote\n\n1/2 Unidad Cebolla Morada\n\n2 Dientes de ajos frescos picados finamente\n\n1 cucharadita de Orégano NATURE´S HEART®\n\n1 cucharadita de Comino Molido\n\n1 Taza Leche Entera La Lechera ®\n\n1/4 Taza Maní\n\n2 Cucharaditas Perejil Fresco\n\n2 Cubos Caldo De Costilla Maggi®\n\n3 Tazas Papas Papas peladas y picadas en cubitos\n\nSal al gusto\n\nPimienta Negra NATURE´S HEART® al gusto Al gusto','Lava y cocina el Mondongo\n\n1.  Lava profundamente la panza en agua fría. Cocínala en olla de presión con 3 litros de agua, cebolla larga y apio \n    durante 30 minutos aproximadamente. Una vez lista, córtala en cubitos. Prepara el refrito\n\n2.  En otra cacerola, haz un refrito a fuego medio con aceite con achiote, cebolla paiteña y ajo. Sazone con orégano \n     NATURE´S HEART® y comino. Prepara la salsa de mini\n\n3.  Agrega la guata cocida en el refrito. Coloca el perejil y maní junto con la Leche LA LECHERA® en una licuadora\n     y procesa todo hasta que tengas una mezcla sin grumos. Añade esta mezcla a la olla con la guata y Añade el \n   Caldo de Costilla MAGGI®. Disuelve bien y añade las papas en trozos. Sirve con tus acompañantes favoritos\n\n4.  Una vez cocidas las papas, listo. Acompaña con arroz, aguacate, tomate y cebollas curtidas y plátanos maduros \n     fritos.\n',4,1),(11,'EMPANADAS DE VERDE CON QUESO  ','4 plátanos verdes\n\n1/2 lb queso\n\nSal\n\nAceite','1. Cocina los plátanos verdes en agua y sal al gusto\n\n2. Cuándo ya estén cocinados retiralos del fuego y amasa bien los plátanos verdes hasta que quede una masa \n     firme y que no se parta\n\n3. Toma una funda transparente y córtala para que se haga más grande, añade un poco de la masa en el centro \n    de la funda, dobla la funda por la mitad y expande con el maso o rodillo hasta que la masa se adelgaze\n\n\n4. Si tienes un molde de plástico para empanadas, coloca la masa en el molde añade queso rallado y cierra por\n     los bordes.\n\n5.Si no tienes molde, abre la funda, añade queso vuelve a doblar la funda, aplasta un poco los bordes y con algo\n    fino (como el palito de la cuchara) puedes darle la forma a la empanada y quita lo restante.\n\n6. En un sartén calienta el aceite y fríe las empanadas (colócalas en papel absorbente)\n\n7. Puedes acompañar con una ensalada o salsa de Ají ',3,1),(12,'JUGO DE MANDARINA','1 taza de agua\n\n2 cucharadas de semillas de cáñamo\n\n2 tazas de mandarina pelada','\nLavar la pera, y poner en la licuadora, añadir las mandarinas ya peladas al vaso, las semillas de cáñamo y el agua,\n licua y disfruta.',2,1),(13,'JUGO DE SANDÍA CON FRESA','350 gr sandía\n\n250 gr de fresas\n\n1/2 vaso de agua de coco\n\n02 hojas de menta\n\nMiel de abeja o Stevia\n\n04 cubos de hielo','Pelar y cortar la sandía.\n\nAgregar los cubos de sandía al vaso de la licuadora junto con el agua de coco.\n\nAgregar miel al gusto.',2,1),(14,'JUGO DE AVENA','1 taza avena\n\n1 lata de leche evaporada\n\nAzúcar a gusto\n\nJugo de 2 o 3 limones\n\n1 cucharada vainilla\n\ncubos de hielo','Mezclar la leche evaporada y la avena.\n\nLlevamos todo a la licuadora.\n\nLicuamos a velocidad media rápida durante 3 minutos más o menos.\n\nPasamos la mezcla por un colador, añadimos nuestra cucharada de vainilla y refrigeramos nuestro jugo.\n\nUna vez esté frío retiramos de la nevera y añadimos el juego de limón y unos cubitos de hielo.',2,1),(16,'TROLICHES CASEROS ','2 tazas azúcar\n\n1 cucharada harina de arroz\n\n1 cucharita café en polvo\n\n2 litro leche entera\n\nc/n canela en rama\n\nPimienta dulce\n\nc/n Esencia de vainilla','\n1. Colocar en una olla la leche, canela, pimienta dulce, azúcar y mezclar bien los ingrediente.\n\n2. Colocar la harina de arroz y disolver con la leche.\n\n3. Luego integrar a la leche cerniendo para que no vaya grumos.\n\n4. Dejar hervir a fuego lento y revolver con cuchara de palo para que no se pegue.\n\n5. Después de hervir colocar la esencia de vainilla.\n\n6. Dejar hervir hasta este espesa para colocar el café en polvo.\n\n7. Mezclar bien y retirar la canela y pimienta dulce.\n\n8. Dejar hasta que este durito o cuando la masa este espesa.\n\n9. Sacar y dejar se enfríe un poco y luego formar las bolitas colocándole maicena \n     para que no se pegue.Un pozuelo.\n\n10. Reservar en un pozuelo.\n\n11. Decorar un frasco a su elección.\n\n12. Llenar y colocar la tarjeta. Obsequio para nuestros invitados.\n\n13. Y los troliches. Se recortan papeles del color deseado\n\n14. Se envuelve los troliches.\n\n15. Se le amarra con cinta de su elección\n\n16. Y los troliches listo para digustar.\n\n17. Y a disfrutar nuestra tarde de Té, en un día especial.',1,1),(17,' ARROZ CON MENESTRA','2-3 cucharadas de aceite\n\n1 cebolla colorada, cortada en cubitos pequeños\n\n1 pimiento verde, cortado en cubitos pequeños\n\n3 tomates, cortados en cubitos pequeños\n\n6 dientes de ajo, machacado\n\n2 cucharaditas de comino molido\n\n1 cucharadita de achiote molido\n\n4 cucharadas de cilantro picadito\n\n7 tazas de agua\n\n1 libra de lentejas, lavadas - no se necesita remojar las lentejas\n\nSal al gusto\n\nUn plátano verde o maduro – opcional (vea la nota al final)','1. Caliente el aceite a fuego medio en una cacerola grande.\n\n2. Prepare un refrito para la menestra añadiendo la cebolla, pimiento, tomate, ajo, comino, achiote, \n    sal y 2 cucharadas del cilantro picado, reserve las dos otras cucharadas del cilantro para el final.\n\n3. Cocine el refrito durante cinco minuto o hasta que todos los ingredientes se hayan ablandado, \n     revolviendo de vez en cuando.\n\n4. Añada el agua e incremente la temperatura hasta que empiece a hervir.\n\n5. Añada las lentejas y reduzca la temperatura a fuego lento, tape parcialmente la cacerola, y cocine hasta \n     que las lentejas estén tiernas, aproximadamente una hora.\n\n6. Mezcle el cilantro restante con la menestra y sirva con arroz (cocinado al estilo ecuatoriano), carne asada o \n     carne frita, patacones o plátanos maduros fritos, una pequeña ensalada o rodajas de aguacate.\n\n\nNotas:\n\n- Para un toque adicional de sabor, se puede preparar un refrito aparte (con ½ cebollas, un poquito de ajo \n  machacado, tomates picados, y comino/achiote/sal) para agregarle a la menestra al final. Otra opción es \n  agregarle una cucharada de aliño lojano (ajos molidos con pimiento verde, cebolla, cilantro, perejil, orégano, \n  comino, y sal) durante los últimos minutos de cocción.\n\n- En la Costa, también se acostumbra agregarle plátano (verde o maduro). El verde se puede rallar o picar \n   finamente, y se agrega durante los últimos 15-20 minutos. El verde rallado también ayuda a espesar la \n   menestra y le da un sabor muy rico. Algunos también le agregan rodajitas de plátano maduro durante los\n    últimos 20-25 minutos, y esto también crea una variación diferente con un toque dulce que contraste muy \n    bien con el sabor de las lentejas.\n\n- El arroz con menestra se sirve con carne asada o carne frita, pero tambien se puede pedir con pollo o con \n   pescado – en especial en la costa. Tambien recuerdo que durante la época que mi mama intento ser \n   vegetariana, reemplazaba la carne con huevo frito, es una manera fácil de adaptar este plato para una dieta\n    vegetariana.',4,1),(18,'CARNE ASADA CON MENESTRA','500 gramos de fréjol canario\n\n1 cebolla colorada grande\n\n1 pimiento\n\n1 tomate\n\n2 dientes de ajo\n\nSal al gusto\n\n2 pedazos de cuero de chancho o tocino\n\nLomo fino y aliños para la carne','1. Remojar los frejoles en agua. Se recomienda hacerlo desde la noche anterior.\n\n2. Lavamos y colocamos los frejoles en una fuente con agua y los ponemos a hervir hasta que estén blandos.\n\n3. Preparamos un refrito con la cebolla colorada, el tomate, el pimiento, el ajo y sal al gusto.\n    Agregamos tocino o cuero de chancho cortado en cuadritos pequeños.\n\n4. Revolvemos el refrito con el fréjol y lo dejamos hervir unos 5 minutos.\n\n5. Condimentamos al gusto la carne; en nuestro caso usaremos: ajo molido, comino, pimienta y sal. \n     Asamos la carne y servimos junto a una porción de arroz blanco.\n\n \n\n',4,1);
/*!40000 ALTER TABLE `recetas` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `auditoria_insertar` AFTER INSERT ON `recetas` FOR EACH ROW BEGIN
    INSERT INTO auditoria (aud_receta, aud_detalle)
    VALUES (new.re_titulo,'se inserto una receta');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `auditoria_actualizar` BEFORE UPDATE ON `recetas` FOR EACH ROW BEGIN
    INSERT INTO auditoria (aud_receta, aud_detalle)
    VALUES (old.re_titulo,'se actualizo la receta');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `auditoria_eliminar` BEFORE DELETE ON `recetas` FOR EACH ROW BEGIN
    INSERT INTO auditoria (aud_receta, aud_detalle)
    VALUES (old.re_titulo,'se elimino la receta');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `rol_id` int NOT NULL AUTO_INCREMENT,
  `rol_tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`rol_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (19,'Admin'),(21,'Usuario');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `usu_id` int NOT NULL AUTO_INCREMENT,
  `usu_cedula` varchar(45) DEFAULT NULL,
  `usu_nombre` varchar(50) NOT NULL,
  `usu_apellido` varchar(45) DEFAULT NULL,
  `usu_direccion` varchar(45) DEFAULT NULL,
  `usu_correo` varchar(45) DEFAULT NULL,
  `usu_contrasenia` varchar(50) NOT NULL,
  `rol_id` int DEFAULT NULL,
  PRIMARY KEY (`usu_id`),
  KEY `rol_id` (`rol_id`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`rol_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'1234567890','Juan','Perez','Ibarra','juan1@gmail.com','123456',19),(6,'1089839982','Karina','Cuatucuamba','Otavalo','karinacuat@gmail.com','0935438',21),(8,'1029882387','Samanta','Coral','Ibarra','samnt65@gmail.com','4y24h',19),(9,'1009222374','Karen','Fernandez','Ibarra','karenfer@gmail.com','4u34b',21),(10,'1022339876','Sandra','Lara','Otavalo','sandra99@gmail.com','vrfwiu',21),(11,'1029483928','Jaime','Gomez','Ibarra','jaime10@gmail.com','3y22h2',21),(13,'1029384728','Humberto','Torres','Otavalo','humberto@gmail.com','humberto123',21),(14,'1005462997','Katherin','Guzman','Otavalo','kadltg12@gmail.com','071121',21);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gestion_recetas'
--

--
-- Dumping routines for database 'gestion_recetas'
--
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarCategoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarCategoria`(
    in p_id_categoria INT,
    in p_nombre_categoria VARCHAR(50)
)
BEGIN
    UPDATE Categorias
    SET cat_nombre = p_nombre_categoria
    WHERE cat_id = p_id_categoria;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarReceta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarReceta`(
    in p_titulo_receta text,
    in p_ingredientes_receta TEXT,
    in p_preparacion_receta text,
    in p_id_categoria INT,
    in p_id_usuario INT
)
BEGIN
    UPDATE Recetas
    SET re_ingredientes = p_ingredientes_receta,
        re_preparacion = p_preparacion_receta,
        cat_id = p_id_categoria,
        usu_id = p_id_usuario
    WHERE re_titulo = p_titulo_receta;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarUsuario`(
    IN p_id INT,
    IN p_cedula VARCHAR(50),
    IN p_nombre VARCHAR(50),
    IN p_apellido VARCHAR(50),
    IN p_direccion VARCHAR(50),
    IN p_correo VARCHAR(50),
    IN p_contrasenia VARCHAR(50),
    IN p_rol_id INT
)
BEGIN
    -- Actualizar el usuario
    UPDATE Usuarios
    SET 
        usu_cedula = p_cedula,
        usu_nombre = p_nombre,
        usu_apellido = p_apellido,
        usu_direccion = p_direccion,
        usu_correo = p_correo,
        usu_contrasenia = p_contrasenia,
        rol_id = p_rol_id
    WHERE usu_id = p_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscarcategoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscarcategoria`(
    IN id INT
)
BEGIN
    SELECT * FROM categorias WHERE cat_id = id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscarreceta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscarreceta`(
    IN id INT
)
BEGIN
    SELECT * FROM recetas WHERE re_id = id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscarusuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscarusuario`(
    IN id INT
)
BEGIN
    SELECT * FROM usuarios WHERE usu_id = id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `CrearCategoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CrearCategoria`(
    in p_nombre_categoria VARCHAR(50)
)
BEGIN
    INSERT INTO Categorias (cat_nombre)
    VALUES (p_nombre_categoria);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `CrearReceta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CrearReceta`(
    in p_titulo_receta TEXT,
    in p_ingredientes_receta TEXT,
    in p_preparacion_receta TEXT,
    in p_id_categoria INT,
    in p_id_usuario INT
)
BEGIN
    INSERT INTO Recetas (re_titulo, re_ingredientes, re_preparacion, cat_id, usu_id)
    VALUES (p_titulo_receta, p_ingredientes_receta, p_preparacion_receta, p_id_categoria, p_id_usuario);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarCategoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarCategoria`(
    IN p_nombre_categoria VARCHAR(50)
)
BEGIN
    DELETE FROM Categorias
    WHERE cat_nombre = p_nombre_categoria;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarReceta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarReceta`(
    in p_titulo TEXT
)
BEGIN
    DELETE FROM Recetas
    WHERE re_titulo = p_titulo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarUsuario`(
    IN p_cedula VARCHAR(50)
)
BEGIN
    DELETE FROM Usuarios
    WHERE usu_cedula = p_cedula;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarUsuario`(
    IN cedula VARCHAR(50),
    IN nombre VARCHAR(50),
    IN apellido VARCHAR(50),
    IN direccion VARCHAR(50),
    IN correo VARCHAR(50),
    IN contrasenia VARCHAR(50),
    IN rol_nombre int
)
BEGIN
    DECLARE rol_id INT;

 SELECT r.rol_id INTO rol_id
FROM Roles r
WHERE r.rol_tipo = rol_nombre;


    INSERT INTO Usuarios (usu_cedula, usu_nombre, usu_apellido, usu_direccion, usu_correo, usu_contrasenia, rol_id)
    VALUES (cedula, nombre, apellido, direccion, correo, contrasenia, rol_id);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `LeerRecetaDesayuno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `LeerRecetaDesayuno`()
BEGIN
    SELECT * FROM Recetas WHERE cat_id = 3;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `LeerRecetaJugos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `LeerRecetaJugos`()
BEGIN
     SELECT * FROM Recetas WHERE cat_id = 2;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `LeerRecetaPatosFuertes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `LeerRecetaPatosFuertes`()
BEGIN
   SELECT * FROM Recetas WHERE cat_id = 4;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `LeerRecetasPostres` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `LeerRecetasPostres`()
BEGIN
    SELECT * FROM Recetas WHERE cat_id = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerTodasCategorias` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerTodasCategorias`()
BEGIN
    SELECT * FROM Categorias;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerTodasRecetas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerTodasRecetas`()
BEGIN
    SELECT * FROM Recetas;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerTodosUsuarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerTodosUsuarios`()
BEGIN
    SELECT * FROM Usuarios;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_Login` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_Login`(
    IN p_usuario VARCHAR(50),
    IN p_contrasenia VARCHAR(50)
)
BEGIN
    DECLARE rol INT;


    SELECT rol_id INTO rol FROM usuarios WHERE usu_nombre = p_usuario AND 
    usu_contrasenia = p_contrasenia;

 
    CASE
        WHEN rol = 19 THEN
            SELECT 'EL USUARIO ES ADMINISTRADOR' AS resultado;  
        WHEN rol = 21 THEN
            SELECT 'SI EXISTE EL USUARIO' AS resultado;  
        ELSE
            SELECT 'NO EXISTE EL USUARIO' AS resultado;  
    END CASE;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-17 23:36:49
