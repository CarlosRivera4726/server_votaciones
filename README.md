
  # Bienvenidos a mi proyecto personal 📝  
  La idea principal es crear un sistema de votaciones, por el momento solo llevo creada
  la interfaz "UI" con html, css y algo de js, aunque es estatico, pero es como quiero que sea vea por el momento. Tengo con Spring Boot las relaciones, el get by id, y faltaria crear lo que seria el patch y el post, por otro lado mejorar la base de datos para los candidatos, para que puedan subir su imagen, de resto todo está llendo por buen camino, les dejo lo que seria los sql, y algunos ejemplos de esos archivos aqui mismo.

  he decidido usar angular para el UI, así que eliminare los archivos de resources, en los commits anteriores van a seguir como quiero que se vea sin problema.

  ## ¿Qué necesitamos para que funcione? 🔥  
  Necesitamos el SDK 17 para que funcione, necesitamos vs code o algun editor de confianza y que les guste, mysql workbench o algun entorno que les permita ver los datos para corroborar la información.

      
  ## Código SQL para crear la base de datos ✨  
  Como les dije aqui les dejo el codigo inicial para crear la base de datos y las tablas, el resto de archivos los encontraran en la carpeta BD.
  ## Vista en swagger
  > [!NOTE]
  > [Link para ver el SWAGGER en localhost](http://localhost:8080/swagger-ui/index.html)
  ![image](https://github.com/CarlosRivera4726/server_votaciones/assets/49885608/d5b6ae9c-543b-403b-a455-7e39441c30f1)


  ```SQL
  DROP DATABASE IF EXISTS REGISTRADURIA;
CREATE DATABASE IF NOT EXISTS REGISTRADURIA;

USE REGISTRADURIA;

CREATE TABLE IF NOT EXISTS VOTACIONES(
	ID INT auto_increment PRIMARY KEY,
    TIPO VARCHAR(25) NOT NULL,
    FECHA DATETIME NOT NULL
);
CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(
	ID INT AUTO_INCREMENT PRIMARY KEY,
    NOMBRE VARCHAR(35) NOT NULL
);

CREATE TABLE IF NOT EXISTS CIUDADES(
	ID INT AUTO_INCREMENT PRIMARY KEY,
    NOMBRE VARCHAR(35) NOT NULL,
    DEPARTAMENTO INT NOT NULL,
    
    CONSTRAINT FOREIGN KEY(DEPARTAMENTO) REFERENCES DEPARTAMENTOS(ID)
);

CREATE TABLE IF NOT EXISTS PERSONAS(
	ID BINARY(16) PRIMARY KEY DEFAULT(UUID_TO_BIN(UUID())),
    NOMBRE VARCHAR(25) NOT NULL,
    APELLIDO VARCHAR(25) NOT NULL,
    CEDULA VARCHAR(255) NOT NULL UNIQUE,
    CIUDAD INT NOT NULL,
	CONTRASEÑA VARCHAR(255) NOT NULL,
    CONSTRAINT FOREIGN KEY (CIUDAD) REFERENCES CIUDADES(ID)
);

CREATE TABLE IF NOT EXISTS PERSONAS_VOTACIONES(
    PERSONA BINARY(16) NOT NULL,
    VOTACION INT NOT NULL,
    DISPONIBLE BOOLEAN NOT NULL DEFAULT 1,
    
    CONSTRAINT FOREIGN KEY (PERSONA) REFERENCES PERSONAS(ID),
    CONSTRAINT FOREIGN KEY (VOTACION) REFERENCES VOTACIONES(ID),
    CONSTRAINT PRIMARY KEY (PERSONA, VOTACION)
);

CREATE TABLE IF NOT EXISTS CANDIDATOS_VOTACIONES (
	ID BINARY(16) PRIMARY KEY DEFAULT(UUID_TO_BIN(UUID())),
    PERSONA BINARY(16) NOT NULL UNIQUE, /* Este se vuelve candidato, lo que quiere decir que debe ser unico*/
    VOTACION INT NOT NULL,
    VOTOS BIGINT NOT NULL DEFAULT(0),
    
    CONSTRAINT FOREIGN KEY (PERSONA) REFERENCES PERSONAS(ID),
    CONSTRAINT FOREIGN KEY (VOTACION) REFERENCES VOTACIONES(ID)
);
  ```

> [!NOTE]
> Se debe realizar la UI nuevamente

## Authors  
- [@CarlosRivera4726](https://github.com/CarlosRivera4726)  

## Screenshots  
![App Screenshot](https://i.imgur.com/0uo0DBv.png)  
