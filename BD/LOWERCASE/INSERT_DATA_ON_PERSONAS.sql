INSERT INTO PERSONAS (ID, NOMBRE, APELLIDO, CEDULA, CIUDAD, CONTRASEÑA) VALUES 
(UUID_TO_BIN(UUID()), 'CARLOS', 'RIVERA', '12345', 1, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'JUAN', 'JOSE', '54321', 1, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'CATALINA', 'BONILLA', '53214', 1, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'FRANCISCO', 'DE ASIS', '5674891', 1, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'FRANK', 'RAMIREZ', '4915495', 2, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'MAILO', 'ZAPATA', '8989898', 2, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'LIZBETH', 'DIAZ', '64859451', 2, SHA2('1234', 256)),
(UUID_TO_BIN(UUID()), 'GUSTAVO', 'BOLIVAR', '123456', 2, SHA2('1234', 256));


SELECT * FROM PERSONAS;

SELECT P.ID, P.NOMBRE, APELLIDO, CEDULA, CONTRASEÑA, dp.NOMBRE DEPARTAMENTO, ci.NOMBRE CIUDAD
FROM PERSONAS P 
JOIN CIUDADES ci 
ON ci.ID = P.CIUDAD 
JOIN DEPARTAMENTOS DP
ON DP.ID = ci.DEPARTAMENTO;
