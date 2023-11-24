-- Finanzas
ALTER TABLE finanzas MODIFY COLUMN finanzasid INT AUTO_INCREMENT;

-- Gastos
ALTER TABLE gastos MODIFY COLUMN gastoid INT AUTO_INCREMENT;

-- Ingreso
ALTER TABLE ingreso MODIFY COLUMN ingresoid INT AUTO_INCREMENT;

-- AhorrosInversiones
ALTER TABLE ahorrosinversiones MODIFY COLUMN ahorroinversionid INT AUTO_INCREMENT;

-- Transacciones
ALTER TABLE transacciones MODIFY COLUMN transaccionid INT AUTO_INCREMENT;

-- DeudasPrestamos
ALTER TABLE deudasprestamos MODIFY COLUMN deudaprestamoid INT AUTO_INCREMENT;

-- RegistroSesiones
ALTER TABLE registrosesiones MODIFY COLUMN sesionid INT AUTO_INCREMENT;
