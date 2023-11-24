-- Tabla para almacenar información financiera
ALTER TABLE Finanzas RENAME TO finanzas;

-- Tabla para gastos
ALTER TABLE Gastos RENAME TO gastos;

-- Tabla para ingresos
ALTER TABLE Ingreso RENAME TO ingreso;

-- Tabla para ahorros e inversiones
ALTER TABLE AhorrosInversiones RENAME TO ahorrosinversiones;

-- Tabla para historial de transacciones
ALTER TABLE Transacciones RENAME TO transacciones;

-- Tabla para deudas y préstamos
ALTER TABLE DeudasPrestamos RENAME TO deudasprestamos;

-- Tabla para registros de sesiones
ALTER TABLE RegistroSesiones RENAME TO registrosesiones;
