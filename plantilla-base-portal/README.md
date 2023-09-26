# Componente EE
Componente empresarial con el servicio DIVISION POLITICA

## Principales Versiones

1. Java EE (8.0.1)
2. Primefaces(11)
3. JDK (11)
4. Maven (3.8.6)
5. DB (H2)
6. App Server (Jboss EAP7.2)

## Arquitectura EE 

Componente que mantiene la independecia y desacoplamiento de sus funciones

- componente empresarial EAR (plantilla-base-portal)
- componente repositorio JAR (repositorio-jpa)
  - Este componente debe existir en el repositorio m2
- componente plantilla   JAR (plantilla-jsf)
  - Este componente debe exitir en el repositorio m2

## Conexion Base Datos

Configuracion en el archivo standalone.xml

```xml
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
```