class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            System.out.println("Fondos insuficientes en la cuenta de " + titular);
            return false;
        }
    }

    public void transferir(Cuenta destino, double monto) {
        if (this.retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto + " de " + this.titular + " a " + destino.getTitular());
        } else {
            System.out.println("Transferencia fallida de $" + monto + " de " + this.titular + " a " + destino.getTitular());
        }
        System.out.println("-----------------------------");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}
