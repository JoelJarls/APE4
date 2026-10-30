class Venta {
    private int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.getPrecio();
            System.out.println("Venta realizada con éxito.");
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("No se pudo realizar la venta.");
        }
        System.out.println("-----------------------------");
    }
}
