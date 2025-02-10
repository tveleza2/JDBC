use vivero;

INSERT INTO Cliente (nombre_cliente,nombre_contacto, apellido_contacto, telefono, fax, ciudad, region, país, codigo_postal, id_empleado, limite_credito) VALUES ('Coca Cola', 'Juan', 'Perez', '123456789', '123456789', 'Buenos Aires', 'Buenos Aires', 'Argentina', '1234', 1, 1000.0);

SELECT * FROM cliente;



USE estancias_exterior;

SELECT * FROM familias;

DELETE FROM cliente WHERE nombre_cliente = 'Postobon';