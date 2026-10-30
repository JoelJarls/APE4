public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Juan Pérez", "1804567890");
        Usuario usuario2 = new Usuario("María López", "1809876543");

        
        Libro libro1 = new Libro("Cien años de soledad");

        
        System.out.println("--- Intento de préstamo 1 ---");
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.registrar();

        
        System.out.println("--- Intento de préstamo 2 ---");
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);
        prestamo2.registrar();
    }
}
