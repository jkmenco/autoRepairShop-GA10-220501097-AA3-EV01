# AutoRepairShop

Proyecto académico desarrollado en **Spring Tool Suite (Eclipse)** como aplicación web Maven (WAR), estructurado bajo el patrón **MVC**.  
La aplicación simula una **tienda de refacciones y reparaciones para autos**, con vistas JSP, controladores en Servlets y conexión futura a **MySQL** desplegada en **Railway**.

## Tecnologías utilizadas
- Java 8+
- Maven
- Servlets (Jakarta EE)
- JSP + JSTL
- Apache Tomcat 9/10
- MySQL (conector JDBC)
- Railway (para despliegue en la nube)

## Estructura del proyecto
autoRepairShop/
├── src/main/java
│    ├── com.autorepairshop.controller
│    ├── com.autorepairshop.model
│    └── com.autorepairshop.dao
├── src/main/webapp
│    ├── WEB-INF/web.xml
│    ├── views/
│    │     ├── products.jsp
│    │     ├── repairs.jsp
│    │     └── login.jsp
│    └── index.jsp
├── pom.xml
└── target/