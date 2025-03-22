package SistemaBancario;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.propietario = propietario;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: El monto debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente o monto inválido.");
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        propietario.mostrarDatos();
    }
}