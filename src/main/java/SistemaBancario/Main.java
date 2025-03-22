package SistemaBancario;

public class Main {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Juan Pérez", "123456789", "Calle 123");
        Cliente cliente2 = new Cliente("María López", "987654321", "Avenida 456");
        Cliente cliente3 = new Cliente("Mellanie Fuentes", "1234567890123", "Manzana y Lote 4");

        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("001", 1000.0, cliente1);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", 500.0, cliente2);
        CuentaBancaria cuenta3 = new CuentaBancaria("003", 5000.0, cliente3);

        // Crear un banco y agregar cuentas
        Banco banco = new Banco("Banco Central", 10);
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.agregarCuenta(cuenta3);

        // Realizar operaciones
        cuenta1.depositar(200.0);
        cuenta2.retirar(100.0);
        cuenta3.depositar(10000.0);

        // Mostrar información de las cuentas
        banco.mostrarCuentas();
    }
}