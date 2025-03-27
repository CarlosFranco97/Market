# Proyecto: Market App

## Descripción

Market App es una API REST desarrollada con Spring Boot y PostgreSQL, diseñada para gestionar productos, clientes y pedidos de un supermercado. Se han implementado mappers para la conversión entre entidades y DTOs, evitando el uso de Lombok para un mejor control del código. La aplicación está diseñada para ser escalable y de fácil mantenimiento.

## Tecnologías utilizadas

Java 17: Lenguaje de programación principal.

Spring Boot: Framework para la creación de aplicaciones empresariales.

Spring Data JPA: Para la gestión de la persistencia de datos.

PostgreSQL: Base de datos relacional utilizada.

MapStruct: Para la conversión entre entidades y DTOs.

Spring Validation: Validación de datos en las solicitudes HTTP.

Gradle: Para la gestión de dependencias y compilación del proyecto.

## Características principales

✅ Gestor de productos, clientes y pedidos con operaciones CRUD.
✅ Uso de DTOs para una mejor separación de lógica de negocio y entidades.
✅ Validaciones en los datos de entrada mediante Spring Validation.
✅ Persistencia con PostgreSQL, utilizando JPA para la manipulación de datos.
✅ Arquitectura orientada al dominio, permitiendo futuras ampliaciones y mejoras.

## Instalación y configuración

1. Clonar el repositorio:
git clone https://github.com/carlosfranco97/market.git

2. Acceder al directorio del proyecto:
cd market

3. La API estará disponible en http://localhost:8080.
