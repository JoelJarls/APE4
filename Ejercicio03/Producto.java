class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            System.out.println("Stock insuficiente.");
            return false;
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
        System.out.println("-----------------------------");
    }

    public double getPrecio() {
        return precio;
    }
}
