public class Main {
    public static void main(String[] args) {
        /
        Cuenta cuenta1 = new Cuenta("Carlos Perez", 500.0);
        Cuenta cuenta2 = new Cuenta("Ana Gomez", 200.0);

        System.out.println("--- Estado Inicial ---");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        System.out.println("-----------------------------");

        
        System.out.println("--- Intentando Transferencia Válida ---");
        cuenta1.transferir(cuenta2, 150.0);

        
        System.out.println("--- Intentando Transferencia Fallida ---");
        cuenta1.transferir(cuenta2, 1000.0);

        System.out.println("--- Estado Final ---");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}
