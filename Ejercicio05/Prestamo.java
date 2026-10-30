lass Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo REGISTRADO con éxito: '" + libro.getTitulo() + "' prestado a " + usuario.getNombre() + " (Cédula: " + usuario.getCedula() + ").");
        } else {
            System.out.println("Préstamo RECHAZADO: El libro '" + libro.getTitulo() + "' no está disponible para " + usuario.getNombre() + ".");
        }
        System.out.println("--------------------------------------------------");
    }
}
