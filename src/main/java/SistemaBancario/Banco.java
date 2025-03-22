package SistemaBancario;

    public class Banco {
        private String nombre;
        private CuentaBancaria[] listaCuentas;
        private int numCuentas;

        // Constructor
        public Banco(String nombre, int capacidad) {
            this.nombre = nombre;
            this.listaCuentas = new CuentaBancaria[capacidad];
            this.numCuentas = 0;
        }

        // Método para agregar una cuenta
        public void agregarCuenta(CuentaBancaria cuenta) {
            if (numCuentas < listaCuentas.length) {
                listaCuentas[numCuentas] = cuenta;
                numCuentas++;
                System.out.println("Cuenta agregada exitosamente.");
            } else {
                System.out.println("Error: No se pueden agregar más cuentas.");
            }
        }

        // Método para mostrar todas las cuentas
        public void mostrarCuentas() {
            System.out.println("Cuentas en el banco " + nombre + ":");
            for (int i = 0; i < numCuentas; i++) {
                listaCuentas[i].mostrarInformacion();
                System.out.println("-----------------------------");
            }
        }
    }
