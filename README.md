# Siniestro

Brindar servicios de consultoría especializada en implementación de Microservicios, habilitando prácticas que
permitan ser ágiles en el proceso de despliegue de sus soluciones, basada en mejorar la entrega, así como dar
orden y certidumbre a las áreas negocio y técnicas de Seguros Banorte, S.A. de C.V.

## Stack Tecnológico

### JDK 11: 
Oracle recomienda que se utilice la última versión liberada de JDK ya que esta contiene
correcciones de Bugs.
### B. REST JAX_RS: 
Es una especificación para crear servicios Web REST que se basa en anotaciones para
simplificar el desarrollo y despliegue.
## C. SEGURIDAD.JAR: 
Este módulo incluye las funciones expuestas en la sección de análisis de dominio, se
empaquetará en un archivo .JAR que se incluirá en cada microservicio.
## D. BUSINESS SERVICE: 
Contendrá las funciones de negocio y los desarrollos especializados de cada
Microservicio.
### E. JDBC: JPA Hibernate conectando a base Oracle
Es el estándar de conectividad de bases de datos de Java y proporciona un mecanismo para que los
programas Java se conecten a las bases de datos. Debido a que los microservicios que se van a desarrollar
no hacen operaciones CRUD, si no que ejecutan procedimientos almacenados en la base de datos, no se
requiere una capa de persistencia de datos. 
### F. REST CLIENT: 
El uso de esta API permite invocar los servicios web REST de la AMIS desde los
microservicios y procesar la respuesta.
### G. Manejo de eventos Active MQ: 
El uso de esta API permite invocar los servicios web REST de la AMIS desde los
microservicios y procesar la respuesta.