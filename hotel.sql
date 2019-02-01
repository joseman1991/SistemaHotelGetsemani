DROP TABLE IF EXISTS pago;
DROP TABLE IF EXISTS consumo;
DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS empleado;
DROP TABLE IF EXISTS habitacion;
DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS persona;


-- Estructura de tabla para la tabla persona

CREATE TABLE persona (
  idpersona serial NOT NULL primary key,
  nombre character varying(50) NOT NULL,
  apaterno character varying(20) NOT NULL,
  amaterno character varying(20) NOT NULL,
  tipo_documento character varying(15) NOT NULL,
  num_documento character varying(10) NOT NULL,
  direccion character varying(100),
  telefono character varying(10) unique,
  email character varying(50) unique
);


-- datos para la tabla persona

INSERT INTO persona (idpersona, nombre, apaterno, amaterno, tipo_documento, num_documento, direccion, telefono, email) VALUES
(1, 'Katherin Natividad', 'Angamarca', 'Naranjo', 'CED', '0202572723', 'Guaranda','0985446223','katherinangamrca95@gmail.com'),
(2, 'Alan Javier', 'Velez', 'Villamar', 'CED', '1207368117', 'Vinces', '0978747234', 'velezvillamar98@gmail.com'), 
(3, 'Orlando Leonel', 'Ramires', 'Muños', 'CED', '1207340678', 'Babahoyo', '0987456987', 'orlandoramires@gmail.com'), 
(4, 'Belen Alexandra', 'Ibarra', 'Figeroa', 'CED', '0298124365', 'Guayaquil', '0912546712', '1'),
(5, 'Tatiana Jazmin', 'Santos', 'Fernandes', 'CED', '0198652345', 'Manta', '0912234576', '2'), 
(6, 'Maria Elizabeth', 'Saltos', 'Garay', 'CED', '1202347596', 'Quito', '0988341243', '3'),
(7, 'Samanta Emperatriz', 'Gomez', 'Hernandes', 'CED', '1203786432', 'Babahoyo', '0923128756', '4'),
(8, 'Jose Alejandro', 'Banchen', 'Lozano', 'CED', '1291783245', 'Loja', '099301784', '5'),
(9, 'Ericka Maoli', 'Burgos', 'Manrique', 'CED', '0291837365', 'Cuenca', '0995001606', '6'),
(10, 'Steven Herediaa', 'Alarcon', 'Navarro', 'CED', '0200378210', 'Ambato', '0987101096', '7'), 
(11, 'Brayan Osvaldo', 'Gonzaales', 'Palma', 'CED', '0201251243', 'Salinas', '0997131571', '8'), 
(12, 'Ulices Samuel', 'Barrera', 'Parra', 'CED', '0200143678', 'Esmeraldas', '0945981243', '9'), 
(13, 'Leonardo David', 'Bernal', 'Rosado', 'CED', '0299221298', 'Ibarra', '0912983456', '0'),
(14, 'Ingrid Rosa', 'Cabeza', 'MontoyA', 'CED', '0891253489', 'Milagro', '0985667685', '19'),
(15, 'Ronad Xavier', 'Estrada', 'Trujillo', 'CED', '0238125673', 'Santo Domingo', '0992931311', '11'),
(16, 'Carlos Andres', 'Ferrero', 'Vega', 'CED', '0207373542', 'Caluma', '0969233599', '12'),
(17, 'Jessica Lli', 'Muñoz', 'Zavala', 'CED', '0209947239', 'Echandia', '0982456723', '13'),
(18, 'Karla Eunice', 'Camejos', 'Varques', 'CED', '1202384583', 'Ventanas', '0989234567', '14'), 
(19, 'Fernanda Camila', 'Hidalgo', 'Uriarte', 'CED', '1207112933', 'Quevedo', '0988822231', '15'),
(20, 'Alexander Juan', 'Iglesias', 'Torres', 'CED', '0202836513', 'Valencia', '0912567326', '16'); 

---------------------------------------------------------- 

--
-- Estructura de tabla para la tabla cliente
--

CREATE TABLE cliente (
  idpersona serial NOT NULL primary key,
  codigo_cliente character varying(10) NOT NULL  
);

--
-- datos para la tabla cliente
--

INSERT INTO cliente (idpersona, codigo_cliente) VALUES
(4, '000001'),
(5, '000002'),
(6, '000003'),
(7, '000004'),
(8, '000005'),
(9, '000006'),
(10, '000007'),
(11, '000008'),
(12, '000009'),
(13, '000010'),
(14, '000011'),
(15, '000012'),
(16, '000013'),
(17, '000014');
----------------------------------------------------------

--
-- Estructura de tabla para la tabla producto
--

CREATE TABLE producto (
  idproducto serial NOT NULL primary key,
  nombre character varying(60) NOT NULL,
  descripcion character varying(255)  NULL,
  unidad_medida character varying(20) NOT NULL,
  precio_venta numeric NOT NULL
);

--
-- datos para la tabla producto
--

INSERT INTO producto (idproducto, nombre, descripcion, unidad_medida, precio_venta) VALUES
(1, 'Agua Vivan', 'Agua de mineral.', 'UND', '0.50'),
(2, 'Galleta Choco', 'Galletas', 'UND', '0.30'),
(3, 'Galleta Amor', 'Galletas', 'UND', '0.50'),
(4, 'Vino Tinto', 'Licor', 'UND', '5.00'),
(5, 'Cola Cocacola', 'Colas ', 'LT', '3.00'),
(6, 'Jugo Sunny', 'Jugo', 'LT', '0.50'),
(7, 'Tortolin', 'Snack', 'UND', '0.50'),
(8, 'Tostinos', 'Snack', 'UND', '0.50'),
(9, 'Chicles Tumix', 'chicles', 'UND', '0.10'),
(10, 'Agua Cielo', 'Agua', 'LT', '0.50'),
(11, 'Cigarrillos Lider', 'Galletas', 'UND', '0.60'),
(12, 'Rufles', 'Snack', 'UND', '0.50'),
(13, 'Dorito ', 'Snack', 'UND', '0.50'),
(14, 'Golpe', 'Snack', 'UND', '0.50'),
(15, 'Galleta Oreo', 'Galletas', 'UND', '0.50');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla habitacion
--

CREATE TABLE habitacion (
  idhabitacion serial NOT NULL primary key,
  numero character varying(4) NOT NULL,
  piso character varying(2) NOT NULL,
  descripcion character varying(600)  NULL,
  caracteristicas character varying(600)  NULL,
  precio_diario numeric NOT NULL,
  estado character varying(15) NOT NULL,
  tipo_habitacion character varying(20) NOT NULL
);

--
-- datos para la tabla habitacion
--

INSERT INTO habitacion (idhabitacion, numero, piso, descripcion, caracteristicas, precio_diario, estado, tipo_habitacion) VALUES
(1, '101', '1', 'Habitación vista al calle', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(2, '102', '1', 'Habitación vista al parquet', 'Unacamas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(3, '103', '1', 'Habitación vista a la calle', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(4, '104', '1', 'Habitación vista a la calle', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(5, '105', '1', 'Habitación vista a la calle', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(6, '106', '1', 'Habitación vista a la calle', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(7, '107', '1', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(8, '108', '1', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(9, '109', '1', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(10, '110', '2', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(11, '111', '2', 'Habitación Moderna', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(12, '112', '2', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(13, '113', '2', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(14, '114', '2', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(15, '115', '2', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(16, '116', '2', 'Habitación Clasica', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Ocupado', 'Individual'),
(17, '117', '2', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Ocupado', 'Individual'),
(18, '118', '2', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Ocupado', 'Individual'),
(19, '119', '2', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Ocupado', 'Individual'),
(20, '120', '2', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Ocupado', 'Individual'),
(21, '121', '2', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Ocupado', 'Matrimonial'),
(22, '122', '3', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Ocupado', 'Matrimonial'),
(23, '123', '3', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Ocupado', 'Matrimonial'),
(24, '124', '3', 'Habitación Moderna', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Ocupado', 'Matrimonial'),
(25, '125', '3', 'Habitación Clasica', 'Una camas, baño propio, TV, Internet, Telefono', '80.00', 'Ocupado', 'Matrimonial'),
(26, '126', '3', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Ocupado', 'Familiar'),
(27, '127', '3', 'Habitación Clasica', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Ocupado', 'Familiar'),
(28, '128', '3', 'Habitación vista al parquet', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Ocupado', 'Familiar'),
(29, '129', '3', 'Habitación vista al parquet', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Ocupado', 'Familiar'),
(30, '130', '3', 'Habitación vista al parquet', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Ocupado', 'Familiar'),
(31, '131', '3', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(32, '132', '3', 'Habitación vista al parquet', 'Dos camas, baño propio, TV, Internet, Telefono', '90.00', 'Disponible', 'Familiar'),
(33, '133', '3', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual'),
(34, '134', '3', 'Habitación vista al parquet', 'Dos camas, baño propio, TV, Internet, Telefono', '80.00', 'Disponible', 'Matrimonial'),
(35, '135', '4', 'Habitación vista al parquet', 'Una camas, baño propio, TV, Internet, Telefono', '50.00', 'Disponible', 'Individual');

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla empleado
--

CREATE TABLE empleado(
  idpersona int NOT NULL primary key,
  sueldo numeric NOT NULL,
  acceso character varying(15) NOT NULL,
  login character varying(15) NOT NULL unique,
  password character varying(10) NOT NULL,
  estado character varying(1) NOT NULL
);

--
-- datos para la tabla trabajador
--

INSERT INTO empleado (idpersona, sueldo, acceso, login, password, estado) VALUES
(1, '1000.00', 'Administrador', 'admin', 'admin', 'A'),
(2, '1000.00', 'Digitador', 'alan', 'javier', 'A'),
(3, '1000.00', 'Digitador', 'leo', 'ramirez', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla reserva
--

CREATE TABLE reserva (
  idreserva SERIAL NOT NULL PRIMARY KEY,
  idhabitacion int NOT NULL,
  idcliente int NOT NULL,
  idempleado int NOT NULL,
  tipo_reserva character varying(20) NOT NULL,
  fecha_reserva date NOT NULL,
  fecha_ingresa date NOT NULL,
  fecha_salida date NOT NULL,
  costo_alojamiento numeric NOT NULL,
  estado character varying(15) NOT NULL,
  CONSTRAINT fk_reserva_habitacion_idx FOREIGN KEY (idhabitacion) REFERENCES habitacion (idhabitacion),
  CONSTRAINT fk_reserva_cliente_idx FOREIGN KEY (idcliente) REFERENCES cliente (idpersona),
  CONSTRAINT fk_reserva_empleado_idx FOREIGN KEY (idempleado) REFERENCES empleado (idpersona)
);

--
-- datos para la tabla reserva
--


INSERT INTO reserva (idreserva, idhabitacion, idcliente, idempleado, tipo_reserva, fecha_reserva, fecha_ingresa, fecha_salida, costo_alojamiento, estado) VALUES
(1, 1, 4, 1, 'Alquiler', '2016-02-15', '2016-02-15', '2016-02-16', '50.00', 'Ocupado'),
(2, 2, 5, 2, 'Reserva', '2016-02-15', '2016-02-15', '2016-02-16', '50.00', 'Ocupado'),
(3, 3, 6, 3, 'Reserva', '2016-02-15', '2016-02-15', '2016-02-16', '50.00', 'Ocupado');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla consumo
--

CREATE TABLE consumo (
  idconsumo SERIAL NOT NULL PRIMARY KEY,
  idreserva Integer NOT NULL,
  idproducto Integer NOT NULL,
  cantidad Integer NOT NULL,
  precio_venta numeric NOT NULL,
  estado character varying(15) NOT NULL,   
  CONSTRAINT fk_consumo_producto_idx FOREIGN KEY (idproducto) REFERENCES producto (idproducto),
  CONSTRAINT fk_consumo_reserva_idx FOREIGN KEY (idreserva) REFERENCES reserva (idreserva)
);

--
-- datos para la tabla consumo
--

INSERT INTO consumo (idconsumo, idreserva, idproducto, cantidad, precio_venta, estado) VALUES
(3, 2, 2, '3', '0.75', 'Aceptado'),
(4, 2, 1, '2', '0.50', 'Aceptado');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla pago  esa es? si
--
  
CREATE TABLE pago (
  idpago SERIAL NOT NULL PRIMARY KEY,
  idreserva int NOT NULL,
  tipo_comprobante character varying(20) NOT NULL,
  num_comprobante character varying(20) NOT NULL,
  iva decimal(4,2) NOT NULL,
  total_pago numeric NOT NULL,
  fecha_emision date NOT NULL,
  fecha_pago date NOT NULL,
  CONSTRAINT fk_pago_reserva_idx FOREIGN KEY (idreserva) REFERENCES reserva (idreserva)
);

--
-- datos para la tabla pago
--

INSERT INTO pago (idpago, idreserva, tipo_comprobante, num_comprobante, iva, total_pago, fecha_emision, fecha_pago) VALUES
(1, 1, 'Factura', '00001', '3.00', '100.00', '2016-02-16', '2016-02-16'),
(2, 2, 'Factura', '00002', '3.00', '109.00', '2016-02-16', '2016-02-16');
