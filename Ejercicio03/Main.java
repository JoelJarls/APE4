public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 800.0, 5);

        System.out.println("--- Estado Inicial ---");
        p1.mostrarProducto();

        
        System.out.println("--- Procesando Venta 1 (2 unidades) ---");
        Venta v1 = new Venta(2);
        v1.aplicar(p1);

        
        System.out.println("--- Procesando Venta 2 (5 unidades) ---");
        Venta v2 = new Venta(5);
        v2.aplicar(p1);

        System.out.println("--- Estado Final ---");
        p1.mostrarProducto();
    }
}
