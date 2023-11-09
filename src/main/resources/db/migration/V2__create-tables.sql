-- Tabla para almacenar información financiera
CREATE TABLE Finanzas (
    FinanzasID INT PRIMARY KEY,
    UsuarioID INT,
    Salario DECIMAL(15, 2),
    OtrosIngresos DECIMAL(15, 2),
    CONSTRAINT FK_Finanzas_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);

-- Tabla para gastos
CREATE TABLE Gastos (
    GastoID INT PRIMARY KEY,
    UsuarioID INT,
    Categoria VARCHAR(50),
    Monto DECIMAL(15, 2),
    Banco VARCHAR(50),
    Fecha DATE,
    Descripcion VARCHAR(255),
    CONSTRAINT FK_Gastos_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);
CREATE TABLE suscripciones{
    ID INT PRIMARY KEY,
    
}
CREATE TABLE Ingreso(
    IngresoID INT PRIMARY KEY,
    UsuarioID INT,
    Monto DECIMAL(15,2)
    Fecha DATE,
    Banco VARCHAR(50),
    Descripcion VARCHAR(255),
    CONSTRAINT FK_Ingreso_Usuario FOREIGN (UsuarioID) REFERENCES usuarios(id)
);

-- Tabla para ahorros e inversiones
CREATE TABLE AhorrosInversiones (
    AhorroInversionID INT PRIMARY KEY,
    UsuarioID INT,
    Tipo VARCHAR(50), -- Cuenta de ahorro, acciones, bonos, etc.
    Saldo DECIMAL(15, 2),
    CONSTRAINT FK_AhorrosInversiones_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);

-- Tabla para historial de transacciones
CREATE TABLE Transacciones (
    TransaccionID INT PRIMARY KEY,
    UsuarioID INT,
    Tipo VARCHAR(50), -- Ingreso o gasto
    Monto DECIMAL(15, 2),
    Fecha DATE,
    Descripcion VARCHAR(255),
    CONSTRAINT FK_Transacciones_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);

-- Tabla para deudas y préstamos
CREATE TABLE DeudasPrestamos (
    DeudaPrestamoID INT PRIMARY KEY,
    UsuarioID INT,
    Tipo VARCHAR(50), -- Préstamo, tarjeta de crédito, etc.
    SaldoActual DECIMAL(15, 2),
    CuotaMensual DECIMAL(15, 2),
    CONSTRAINT FK_DeudasPrestamos_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);

-- Tabla para registros sesiones
CREATE TABLE RegistroSesiones (
    SesionID INT PRIMARY KEY,
    UsuarioID INT,
    FechaHoraInicio DATETIME,
    FechaHoraFin DATETIME,
    CONSTRAINT FK_RegistroSesiones_Usuario FOREIGN KEY (UsuarioID) REFERENCES usuarios(id)
);
